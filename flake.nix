{
  inputs.nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
  outputs =
    { nixpkgs, ... }:
    let
      system = "x86_64-linux";
      pkgs = import nixpkgs { inherit system; };
    in
    {
      devShell.${system} = pkgs.mkShell {
        packages = with pkgs; [ gradle_9 ];
        env.LD_LIBRARY_PATH = "${pkgs.lib.makeLibraryPath (
          with pkgs;
          [
            vulkan-loader
            libudev-zero
            libGL
          ]
        )}";
      };
    };
}
