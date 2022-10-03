function main(input) {
  const a = input.split(" ");  // 入力

  // コードを入れる

  console.log(a); // 出力
}

main(require("fs").readFileSync("/dev/stdin", "utf8"));