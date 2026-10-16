# Без паники — Полная сборка для GitHub Actions (Готовый Android-проект)

В этот архив включены **все системные файлы Gradle** (`gradlew`, `gradlew.bat`, папка `gradle/wrapper`, корневые `build.gradle.kts`, `settings.gradle.kts`, `gradle.properties`), а также готовый сценарий облачной сборки `.github/workflows/build-apk.yml`.

## Как загрузить на GitHub:
1. Распакуйте архив `bez_paniki_github_ready.zip` в отдельную папку на компьютере.
2. Откройте ваш репозиторий на GitHub (вкладка **Code**) → нажмите **Add file** → **Upload files**.
3. Перетащите **ВСЕ файлы и папки из распакованного архива** (`app`, `gradle`, `.github`, `gradlew`, `gradlew.bat`, `build.gradle.kts`, `settings.gradle.kts`, `gradle.properties`, `README.md`) прямо в окно загрузки GitHub.
4. Нажмите зеленую кнопку **Commit changes** внизу страницы.
5. Перейдите на вкладку **Actions** — через 1–2 минуты сборка завершится зеленой галочкой, и внизу страницы в блоке **Artifacts** вы сможете скачать готовый подписанный APK (`bez-paniki-release-apk`).
