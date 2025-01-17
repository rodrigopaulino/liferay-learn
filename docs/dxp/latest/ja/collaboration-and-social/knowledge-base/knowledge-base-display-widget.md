# ナレッジベース・ディスプレイウィジェット

ナレッジベース・ディスプレイウィジェットでは、公開したナレッジベースの記事が1ページに表示されます。 このウィジェットでは、記事の表示方法や表示する記事をカスタマイズできます。 ウィジェットをサイトページに追加するには、

1.  ページに移動し、ページの右上にある *[Add]*（![Add icon](../../images/icon-add.png)）をクリックします。

2.  ナレッジベース・ディスプレイウィジェットは、*[コンテンツ管理]* セクションにあります。 ウィジェットをページに追加します。

デフォルトでは、ナレッジベース・ディスプレイウィジェットにはナレッジベースのホームフォルダの記事が表示されます。 別のフォルダに変更するには、

1.  ウィジェットの*[オプション]* アイコン（![Options icon](../../images/icon-options.png)）をクリックし、*[設定]* を選択します。

2.  *[Setup]* タブで、*[一般]* タブを選択し、[記事もしくはフォルダ]フィールドで*[Select]* をクリックします。 [Select Entry]フォームが表示されます。

    ![別のフォルダまたは記事を選択します。](./knowledge-base-display-widget/images/03.png)

3.  表示させたい記事もしくはフォルダの横にある*[Select]* をクリックします。 または、[Select Entry]フォームの上部にある*[このフォルダを選択]* ボタンをクリックして、現在のフォルダを選択することもできます。

4.  *[保存]* をクリックしてウィンドウを閉じます。

ナレッジベース・ディスプレイウィジェットには、追加設定オプションもあります。

  - 表示設定
  - コミュニケーション設定
  - 共有設定
  - 範囲設定

ナレッジベース・ディスプレイのナビゲーションメニューと表示オプションは、フルページのウィジェットに最適な候補です。 記事のフォルダを表示すると、ウィジェットの左側のナビゲーションに、フォルダのすべての記事へのリンクが表示されます。

![左側のナビゲーションメニューには、記事のリンクが表示されます。](./knowledge-base-display-widget/images/05.png)

ウィジェットの右側の表示エリアには、フォルダの先頭の記事（*優先度1*の記事）が表示されます。 ナビゲーションで記事をクリックすると、その記事が表示エリアに表示されます。 現在表示されている記事のリンクは、ナビゲーションに太字で表示されます。 候補セクションの前にある記事の下部にあるリンクをクリックして、記事間を移動することもできます。

![左側にナビゲーションが、右側に記事が表示されます。](./knowledge-base-display-widget/images/04.png)

ナレッジベース・ディスプレイでは、記事の階層を表示することもできます。 子記事がある記事を表示すると、ナビゲーションツリーが展開され、子記事へのリンクが表示されます。 別の一番上のレベルの記事を表示すると、展開されたノードが折りたたまれます。

ウィジェットの上部にあるリンクは、記事に対する次のアクションを公開します。

  - ナレッジベースのRSSフィードを購読する
  - 現在の記事を購読する
  - 現在の記事の履歴を表示する
  - 現在の記事を印刷する

管理者は、ウィジェットの上部にある追加のリンクセットにアクセスできます。

  - 記事を編集する
  - 子記事を追加する
  - 記事を移動する
  - 記事を削除する

記事のコンテンツの下には評価インターフェイスがあり、サムアップ/サムダウンのアイコンが表示されています。 ユーザーは記事の下にある*Do you have any suggestions*?と書かれたテキストボックスに提案やコメントを投稿することもできます。 管理者は、[提案を確認し、それらの進行状況をマークすることができます](responding-to-knowledge-base-feedback.md)。

管理者がナレッジベースアプリのソースURL機能を有効にし（詳細は後述）、記事にソースURLが割り当てられている場合、記事のタイトルの右に*[GitHub上で編集]* ボタン（![GitHub icon](./knowledge-base-display-widget/images/06.png)）が表示されます。 このボタンは、GitHubの記事のソースにリンクしています。 この機能を利用して、記事の修正や改善のための投稿を促すことができます。 この機能に興味がある場合は、[Knowledge Base System Settings](knowledge-base-system-settings.md)の指示に従うよう、管理者に伝えてください。

## さまざまな記事セットの表示

フォルダを使用して類似の記事を集約し、ユーザーがこれらの記事間を簡単に切り替えられるようにする方法を提供できます。 ナレッジベース・ディスプレイのコンテンツフォルダ機能では、記事セット間を切り替えるためのセレクタがナビゲーションの上部に追加されています。

次の手順に従って、コンテンツフォルダを設定します。

1.  サイト管理のナレッジベースアプリにフォルダを追加します。 次に、このフォルダにサブフォルダを作成します。 これらのサブフォルダが*コンテンツフォルダ*になります。

2.  各コンテンツフォルダに記事を追加します。

3.  ナレッジベース・ディスプレイの*[オプション]* メニュー（![Options icon](../../images/icon-options.png)）から*[設定]* を選択します。 *[Setup]* → *[一般]* タブで、コンテンツフォルダの親フォルダを選択し、*[保存]* をクリックします。

コンテンツセレクタの値は、コンテンツフォルダの名前を反映しています。 選択するとその記事が表示されます。

![ユーザーは、さまざまな記事のセットから選択できます。](./knowledge-base-display-widget/images/05.png)

セレクタに表示される名前に共通のプリフィックスを追加することもできます。

1.  ナレッジベース・ディスプレイの*[オプション]* メニュー（![Options icon](../../images/icon-options.png)）から*[設定]* を選択します。 [設定]ダイアログで、*[Setup]* → *[表示設定]* タブを選択します。

2.  プリフィックスを*[コンテンツルートのプリフィックス]* フィールドに入力し、*[保存]* をクリックします。
