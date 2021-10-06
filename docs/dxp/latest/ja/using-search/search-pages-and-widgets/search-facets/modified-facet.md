# 編集済みファセット

編集済みファセットは、検索結果を、検索されたキーワードおよび特定の期間中に作成または変更された結果に一致するものに絞り込みます。

![編集済みファセット結果の例。](modified-facet/images/01.png)

事前設定された期間を選択する他に、ユーザーはカスタム範囲を選択し、日付ピッカーを使用して開始日と終了日を指定できます。

## 編集済みファセットの設定

編集済みファセットを設定するには、ファセットのオプションメニューを開き（![Click on the options icon of the search bar.](../../../images/icon-app-options.png)）、*[設定]* をクリックします。

![[設定]オプションをクリックします。](modified-facet/images/02.png)

**表示設定：***[Default]*、*[コンパクトレイアウト]*、*[ラベルレイアウト]* から選択します。 デフォルトのレイアウトでは、各用語の横にチェックボックスが表示されますが、コンパクトレイアウトでは表示されません。 ラベルレイアウトでは、用語ごとにクリック可能な小さなラベルが表示されます。

詳細設定では、時間範囲を変更、削除、または作成できます。

利用可能な時間範囲エイリアスには次のものがあります

    past-hour
    past-24-hours
    past-week
    past-month
    past-year

デフォルトでは、すべての時間範囲は`*`で終わり、*現在*まで評価されます。 たとえば、past-week範囲は次のようになります。

    [past-week TO *]

しかし、現在まで範囲の終わりは制限されていません。 `*`の代わりに、別の時間範囲エイリアスを終了点として指定できます。

たとえば、12か月前から1か月前までの範囲を設定するには、

1.  既存の範囲のいずれかでプラスボタンをクリックします。

2.  **Past 1-12 Months**とラベルを付けます。

3.  範囲の値を以下のように指定します。

    ``` 
     [past-year to past-month]
    ```

これにより、編集済みファセットの用語として代替の時間範囲を使用する際の柔軟性が高まります。

完了したら、* [保存]* ボタンをクリックします。