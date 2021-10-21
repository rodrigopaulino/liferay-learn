# Gogo シェルコマンド

Gogoシェルは、[Felix Gogoの基本コマンド](https://felix.apache.org/documentation/subprojects/apache-felix-gogo.html#basic-commands)とLiferayのコマンドを実行します。 Gogoシェルには、[コントロールパネル](./using-the-gogo-shell.md)（推奨）および[コマンドライン](./command-line-gogo-shell.md)からアクセスできます。

一般的に使用されるコマンドは次のとおりです。

| コマンド                                     | 説明                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|:---------------------------------------- |:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `b [BUNDLE_ID]`                          | バンドルのシンボリック名、バンドルID、データルート、登録済み（提供済み）サービスと使用済みサービス、インポートおよびエクスポートされたパッケージなど、特定のバンドルに関する情報を一覧表示します。                                                                                                                                                                                                                                                                                                                                       |
| `diag [BUNDLE_ID]`                       | 指定されたバンドルが動作しない理由（依存関係が未解決など）に関する情報を一覧表示します。                                                                                                                                                                                                                                                                                                                                                                                             |
| `dm na`                                  | 「利用できない」（未解決）のOSGiコンポーネントを一覧表示します。 Dependency Managerの詳細は、[Leveraging the Shell](http://felix.apache.org/documentation/subprojects/apache-felix-dependency-manager/tutorials/leveraging-the-shell.html)を参照してください。                                                                                                                                                                                                                        |
| `ds:unsatisfied`                         | 設定未完了のDeclarative Services（DS）コンポーネントをすべて一覧表示します                                                                                                                                                                                                                                                                                                                                                                                         |
| `ds:unsatisfied [BUNDLE_ID]`             | バンドルの設定未完了のDSコンポーネントを一覧表示します                                                                                                                                                                                                                                                                                                                                                                                                             |
| `headers [BUNDLE_ID]`                    | バンドルの `MANIFEST.MF` ファイルからバンドルに関するメタデータを一覧表示します。                                                                                                                                                                                                                                                                                                                                                                                         |
| `equinox:refresh [BUNDLE_ID]`            | 利用可能なオプションの依存関係を検出し、バンドルを再有効化します。                                                                                                                                                                                                                                                                                                                                                                                                        |
| `help`                                   | 利用可能なすべてのGogoシェルコマンドを一覧表示します。 各コマンドの名前には、コロンで区切られた2つの部分があることに注意してください。 たとえば、 `help` コマンドのフルネームは `felix:help`です。 前半はコマンドスコープ、後半はコマンドファンクションです。 スコープ部分は、同じ名前のコマンドの曖昧さをなくすことができます。 例えば、スコープの部分で `felix:refresh` コマンドと `equinox:refresh` コマンドを区別することができます。                                                                                                                                                                                   |
| `help [COMMAND_NAME]`                    | 特定のコマンドに関する情報（コマンドの説明、コマンドのスコープ、コマンドを起動する際に指定できるフラグやパラメータに関する情報）を一覧表示します。                                                                                                                                                                                                                                                                                                                                                                |
| `inspect capability service [BUNDLE_ID]` | バンドルによって公開されるサービスを一覧表示します                                                                                                                                                                                                                                                                                                                                                                                                                |
| `install [PATH_TO_JAR_FILE]`             | 指定されたバンドルをLiferayのモジュールフレームワークにインストールします。                                                                                                                                                                                                                                                                                                                                                                                                |
| `lb`                                     | Liferayのモジュールフレームワークにインストールされているすべてのバンドルを一覧表示します。 `-s` フラグを使用すると、バンドルのシンボリック名を使用してバンドルが一覧表示されます。                                                                                                                                                                                                                                                                                                                                         |
| `packages [PACKAGE_NAME]`                | 指定されたパッケージのすべての依存関係を一覧表示します。                                                                                                                                                                                                                                                                                                                                                                                                             |
| `scr:list`                               | モジュールフレームワークに登録されているすべてのコンポーネントを一覧表示します（*scr* は、サービスコンポーネントランタイムを意味します）。                                                                                                                                                                                                                                                                                                                                                                 |
| `scr:info [COMPONENT_NAME]`              | コンポーネントの説明、サービス、プロパティ、設定、リファレンスなど、特定のコンポーネントに関する情報を一覧表示します。                                                                                                                                                                                                                                                                                                                                                                              |
| `services`                               | モジュールフレームワークに登録されているすべてのサービスを一覧表示します                                                                                                                                                                                                                                                                                                                                                                                                     |
| `start [BUNDLE_ID]`                      | 指定したバンドルを起動します                                                                                                                                                                                                                                                                                                                                                                                                                           |
| `stop [BUNDLE_ID]`                       | 指定したバンドルを停止します                                                                                                                                                                                                                                                                                                                                                                                                                           |
| `system:check`                           | `ds:unsatisfied` および `dm na` コマンドを実行し、システムに異常がないかスキャンします。                                                                                                                                                                                                                                                                                                                                                                                |
| `uninstall [BUNDLE_ID]`                  | 指定されたバンドルをモジュールフレームワークからアンインストールします。 これは指定されたバンドルをLiferayのモジュールフレームワークから削除するものではありません。Gogoの `lb` コマンドでは非表示になっていますが、まだ存在しています。 したがって、アンインストールされたバンドルの新しいバージョンを追加すると、再インストールされるのではなく、現在非表示のアンインストールされたバージョンが更新されます。 Liferayのモジュールフレームワークからバンドルを永久に削除するには、`[Liferay Home]/osgi`フォルダから手動で削除してください。 `uninstall` コマンドの詳細は、OSGiの [uninstall](https://osgi.org/javadoc/r6/core/org/osgi/framework/Bundle.html#uninstall\(\)) のドキュメントを参照してください。 |

## 追加情報

  - [Using the Gogo Shell](./using-the-gogo-shell.md)
  - [Command Line Gogo Shell](./command-line-gogo-shell.md)
  - [Apache Felix Gogo official documentation](http://felix.apache.org/documentation/subprojects/apache-felix-gogo.html).