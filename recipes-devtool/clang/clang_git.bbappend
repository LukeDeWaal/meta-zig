# Zig has a minimum set of required architectures

LLVM_TARGETS_TO_BUILD:append = ";AArch64;AMDGPU;ARM;AVR;BPF;Hexagon;Lanai;LoongArch;Mips;MSP430;NVPTX;PowerPC;RISCV;Sparc;SystemZ;VE;WebAssembly;X86;XCore"
LLVM_EXPERIMENTAL_TARGETS_TO_BUILD:append = "SPIRV"

