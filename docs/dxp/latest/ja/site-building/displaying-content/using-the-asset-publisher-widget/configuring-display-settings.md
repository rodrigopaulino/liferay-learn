# 表示設定の構成

アセットパブリッシャーの[アセットを選択](./selecting-assets-for-the-asset-publisher.md)したら、いくつかの表示設定を構成して、ユーザーがコンテンツを表示する方法を指定できます。  次の手順を実行します：

1.  アセットパブリッシャーの上にカーソルを置き、ウィジェットのメニューでオプションアイコン（![Options](../../../images/icon-app-options.png)）をクリックし、*[設定]* を選択します。
2.  *[Setup]* タブを選択した状態で、*[表示設定]* タブをクリックします。
3.  *[表示設定]* パネルで、表示テンプレートを選択します。
4.  *[表示設定]* タブで残りのオプションを設定します。
5.  *[設定と有効化]* パネルを展開し、有効にするオプションのボックスをオンにします。
6.  *[メタデータ]* パネルを展開し、オプションを[設定可能一覧]ボックスから[現在]ボックスに移動して、各アセットのメタデータを表示します。 たとえば、表示するタグとカテゴリを選択できます。 その後、ユーザーはタグとカテゴリをクリックして、表示されたアセットを手動でフィルタリングできます。

![表示されたアセットに関するさまざまな種類のメタデータを表示するようにアセットパブリッシャーを設定できます。](./configuring-display-settings/images/04.png)

1.  *[グループ化]* パネルを展開し、オプションでグループ化ルールを設定します。
2.  *[保存]* をクリックし、表示設定を適用します。

## アセットパブリッシャーの表示設定リファレンス

### 表示設定

![アセットパブリッシャーでは、いくつかの表示設定を使用できます。](./configuring-display-settings/images/01.png)

これらのテンプレートは、デフォルトですべてのサイトにあります。

| 表示テンプレート  | 範囲     | 説明                                                                                                                                                                                                                         |
| --------- | ------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 概要        | インスタンス | **[概要の長さ]**フィールドで定義された、コンテンツの最初の 200 ～ 500 文字を表示します。 これがデフォルトの表示テンプレートです。                                                                                                                                                  |
| 表         | インスタンス | テーマ開発者がスタイルを設定できる HTML テーブルにコンテンツを表示します                                                                                                                                                                                    |
| タイトルの一覧   | インスタンス | コンテンツを入力したユーザーによって定義されたコンテンツのタイトルを表示します                                                                                                                                                                                    |
| すべてのコンテンツ | インスタンス | エントリのコンテンツ全体を表示します                                                                                                                                                                                                         |
| 要約（文字数多め） | グローバル  | 各アセットの概要ビューを、記事のすべてのコンテンツへの*[続きを読む]* リンクとともに表示します                                                                                                                                                                           |
| 地図        | グローバル  | Google マップまたは Open Street Map プロバイダーのいずれかで、 [地理的にローカライズされたアセット](../../site-settings/site-content-configurations/configuring-geolocation-for-assets.md)を表示します。 マッププロバイダーは、[Instance Settings]および[詳細設定]セクションの[サイト設定]で構成できます。 |

*[表示設定]* セクションの残りの設定は次のとおりです。

| 設定           | 説明                                                                                                                                                                                                                                           |
| ------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 概要の長さ        | 概要に表示する文字数を選択します。 デフォルトは `200`です。 このオプションは、要約表示テンプレートでのみ使用できることに注意してください。                                                                                                                                                                    |
| アセットリンクの振る舞い | デフォルト値は*[全内容を表示する]* です。これは、現在のアセットパブリッシャーの完全なアセットを表示します。 *[コンテキストの参照]* は、アセットが属するアプリケーションにアセットを表示します。 たとえば、ブログエントリーは、作成されたブログに表示されます。 詳細は、表示ページの以下のセクションを参照してください。                                                                             |
| 表示するアイテム数    | 表示できるアセットの最大数。 ページネーションが有効になっている場合、この数はページごとに表示できるアセットの最大数を表します。                                                                                                                                                                             |
| ページ番号タイプ     | ページネーションのために表示するUIのタイプ。 3 つのオプションが利用可能です：*[None]*: ページネーションコントロールを表示しません。 *[Simple]*: アセットのページを参照するための [Previous] ボタンと [次へ] ボタンを追加します。 *[Regular]*: [First]ボタンと[最後]ボタン、ページのドロップダウンセレクター、ページごとの項目数、結果 (表示されるアセット) の合計数など、より多くのオプションと情報を追加します。 |

### オプションの設定と有効化

印刷、フラグ、評価、コメント、コメントの評価、ソーシャルブックマークなどの多くは、他のアプリケーションと同じように機能します。

![有効にできるオプションがいくつかあります。](./configuring-display-settings/images/03.png)

![アセットパブリッシャーでソーシャルブックマークを表示できます。](./configuring-display-settings/images/02.png)

次のオプションを使用できます。

| 設定                                             | 説明                                                                                                                                                                                                    |
| ---------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| コンテンツ追加ボタンを表示する                                | 選択すると、*[新規追加を行う]* ボタンが表示され、ユーザーは アセットパブリッシャーアプリケーションから新しいアセットを直接追加できます。 これはデフォルトでオンになっています。                                                                                                            |
| メタデータの説明を表示                                    | *...関連コンテンツ*または*...タグ付きのコンテンツ*などのメタデータの説明を公開されたアセットとともに表示できるようにします。                                                                                                                                   |
| 利用可能な言語を表示する                                   | コンテンツはローカライズできるため、ロケールに基づいて異なるバージョンを作成できます。 このオプションを有効にすると、使用可能なロケールが表示されるため、ユーザーはコンテンツを自分の言語で表示できます。                                                                                                 |
| このページのデフォルトアセットパブリッシャーに設定する                    | アセットパブリッシャーアプリはインスタンス化可能なアプリです。複数のアセットパブリッシャーをページに追加でき、それぞれが独立した構成を持ちます。 ページのデフォルトのアセットパブリッシャーは、ページに関連付けられたコンテンツを表示するために使用されるものです。                                                                    |
| \[現在の表示ページテンプレート\]を表示ページテンプレートとするアセットのみを表示する | 指定された表示ページテンプレートにのみ存在するアセットを表示します。                                                                                                                                                                    |
| URLに指定されたタグを含める                                | URLに指定されたタグを組み込みます                                                                                                                                                                                    |
| ...を有効にする                                      | 表示されたアセットのこれらのオプションを有効/無効にします。 印刷オプションは、アセットの全体表示に*印刷*リンクを追加します。 *[印刷する]* をクリックすると、アセットの印刷ビューを含む新しいブラウザウィンドウが開きます。 フラグ、関連アセット、評価、コメント、コメントの評価、またはソーシャルブックマークを有効にすると、対応するソーシャル機能へのリンクがアセットの全体表示に追加されます。 |
| ソーシャルブックマーク                                    | ブックマークを[設定可能一覧] ボックスから[現在] ボックスに移動して、表示するソーシャルメディアのリンクを指定します。                                                                                                                                         |

``` tip::
   フラグ、コメント、評価をページに追加する別の方法は、*ページフラグ*、*ページコメント*、および *ページの評価* アプリケーションを使用することです。 フィードバックが必要なアセットの近くの適切な場所にアプリケーションを追加するだけです。
```

### メタデータ

このセクションでは、アセットエントリーとともに表示するメタデータを指定します。 メタデータを[設定可能一覧]ボックスから[現在]ボックスに移動して含めます。

![アセットとともにいくつかの異なるタイプのメタデータを表示できます。](./configuring-display-settings/images/04.png)

### グループ化

*[グループ化]* セクションは、表示されたアセットをどのグループに分割するかを指定します。 アセットをタイプ別またはボキャブラリ別にグループ化できます (定義済みの場合)。

![アセットを異なるグループに分けることができます。](./configuring-display-settings/images/05.png)

たとえば、*[メンバーシップタイプ]* というボキャブラリがあり、*[Premium]* と*[Regular]* の2つのカテゴリがあるとします。 メンバーシップタイプでアセットをグループ化すると、[Premium]カテゴリのすべてのアセットが1つのグループに表示され、[Regular]カテゴリのすべてのアセットが別のグループに表示されます。 グループ化ルールは、[順序付けルール](./selecting-assets-for-the-asset-publisher.md#configuring-asset-display-ordering)の前に適用されます。 順序付けルールは、アセットのグループごとに個別に適用されます。 下の図の例では、アセットをタイプ別にグループ化しています。画像は、Webコンテンツ記事の後にリストされます。

![アセットをタイプ別にグループ化できます。](./configuring-display-settings/images/06.png)