# カウントアプリ拡張

## ベースアプリ
### 機能
- プラスボタン
- マイナスボタン
- クリアボタン

### ベース(Constraint Chain Spread)

<img src="https://user-images.githubusercontent.com/25949472/81243022-94b31c80-9049-11ea-869a-dd3db532da83.png" width="300" >

## 機能拡張

### 1.if 文

1. テキストの色変える
   1. 3→green
   2. 5→blue
   3. 15→red
2. when 文(if のリファクタ)

### 2.配列(&リスト)

1. キーワードの配列で index を increment していって、キーワードが変わる
2. 配列外アクセスに対する例外処理を入れる
   - ”その番号のキーワードは存在しません”を setText する

### 3.レイアウト

1. ConstraintLayout

   1. お手本アプリと同じようにレイアウトを組む
      1. Chain Spread(解説で spread_inside, packed 見せる)
      2. Start, End
      3. constraintBottom_toTopOf とか

2. Button

   1. 背景色を変える(backgroundColor: colorPrimary(`#6200EE`), colorAccent(`#03DAC5`), @android:color/darker_gray(`#AAA`))
   2. 文字色を変える(textColor: white)
   3. 文字サイズを大きくする(textSize: 40sp)
   4. 余白を大きくする(padding: 10dp, 90dp)

3. TextView

   1. 文字サイズを大きくする(textSize: 20sp, 70sp)
   2. 文字スタイルを変える(Bold)
   3. 左右に余白をつける(margin: 16dp, layout_width: match_parent)
   4. gravity(textview), layout_gravity

4. Button の余白のリファクタ(文字量によって横幅が変わってしまう問題)
   1. 左右に余白をつける(margin: 100dp, layout_width: match_parent)

## レイアウト例

### キーワードの表示

#### デフォルト

<img src="https://user-images.githubusercontent.com/25949472/81243028-98df3a00-9049-11ea-8ca9-1e6bc52ed66d.png" width="300" >

#### キーワードがないとき

<img src="https://user-images.githubusercontent.com/25949472/81243035-9e3c8480-9049-11ea-9916-2e59587e12cd.png" width="300" >

### Button のレイアウト

<img src="https://user-images.githubusercontent.com/25949472/81243038-a1d00b80-9049-11ea-9327-a5910e33e02c.png" width="300" >

### TextView と他の Button のレイアウト

<img src="https://user-images.githubusercontent.com/25949472/81243041-a5639280-9049-11ea-9a9a-5a867b325fdd.png" width="300" >

### Button レイアウトの改善

<img src="https://user-images.githubusercontent.com/25949472/81243048-ae546400-9049-11ea-8920-533442824b12.png" width="300" >
