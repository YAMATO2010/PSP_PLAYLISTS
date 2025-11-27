# PSP_PLAYLISTS


## 使い方

####  準備　パソコンがkotlinを使える(動かせる)状態にする
- 1 PSPをUSB接続、または挿入しているメモリースティックの   \PSP\PLAYLIST\MUSIC\   に、txtファイル、またはm3u8ファイルを作成する
- 2 その中に１行ずつ    \MUSIC\   (ルートの中にある方です)　の下にある音楽ファイルのパスをwindowsのエクスプローラーで「パスをコピー」し、貼り付ける　※　ここでの順番がプレイリストの順番になります！
- 3 その後ファイルの変更を保存し、コマンドプロンプトやパワーシェルで
```powershell
PS C:\Users\UserName> kotlin <本スクリプトのパス> <プレイリストのパス>
```
を入力し実行すると…出来上がり！(<と>は入力しない)

## 仕様


<table>
  <thead>
    <tr>
      <th>種類</th> <th>内容</th>
    </tr>
  </thead>
  <tr>
    <td>推奨OS </td> <td>Windows</td>
  </tr>
  <tr>
    <td>対応ファイル</td> <td>m3u8,txt</td>
  </tr>
   <tr>
    <td>言語</td> <td>kotlin(スクリプト)</td>
  </tr>
   <tr>
    <td>インターフェース</td> <td>CLI</td>
  </tr>
   <tr>
    <td>再生確認機種</td> <td>PSP１０００</td>
  </tr>
  

</table>

