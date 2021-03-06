## [2.1.5](https://github.com/bendavies99/BabbleBot-Server/compare/v2.1.4...v2.1.5) (2020-10-26)


### Bug Fixes

* **d4j:** Updated discord wrapper to match d4j updates ([f811ab0](https://github.com/bendavies99/BabbleBot-Server/commit/f811ab08bc632f18380d21d708831d08e481d1f7))


### Reverts

* Revert "chore(release): 2.1.5 [skip ci]" ([25c2a18](https://github.com/bendavies99/BabbleBot-Server/commit/25c2a18d640ecbc02e7f84c498abdf98320f9657))
* Revert "chore(release): 2.1.5 [skip ci]" ([ba6d8ee](https://github.com/bendavies99/BabbleBot-Server/commit/ba6d8ee5a5c6f5a9e8472b8c9a2352612f664f3f))

## [2.1.4](https://github.com/bendavies99/BabbleBot-Server/compare/v2.1.3...v2.1.4) (2020-04-21)


### Bug Fixes

* **plugins:** Add ability to get plugins ([af6d6fe](https://github.com/bendavies99/BabbleBot-Server/commit/af6d6fef4bd5d9f1a16930581ad44b8663248074))

## [2.1.3](https://github.com/bendavies99/BabbleBot-Server/compare/v2.1.2...v2.1.3) (2020-04-17)


### Bug Fixes

* Ignore prereleases ([ca7df6f](https://github.com/bendavies99/BabbleBot-Server/commit/ca7df6f39a1b6b91e7d6fac3dfb75cc7f280e991))

## [2.1.2](https://github.com/bendavies99/BabbleBot-Server/compare/v2.1.1...v2.1.2) (2020-04-02)


### Bug Fixes

* **restarting:** Announcement not being sent on restart ([6c3b86e](https://github.com/bendavies99/BabbleBot-Server/commit/6c3b86eb1dcd2a5814c13b4fa50b7e7b6a731e8e))

## [2.1.1](https://github.com/bendavies99/BabbleBot-Server/compare/v2.1.0...v2.1.1) (2020-04-01)


### Bug Fixes

* **updates:** Pick announcement channel by random ([158c11f](https://github.com/bendavies99/BabbleBot-Server/commit/158c11f63c740ee5d946ce7d70229f85caa16cc6))

# [2.1.0](https://github.com/bendavies99/BabbleBot-Server/compare/v2.0.3...v2.1.0) (2020-04-01)


### Features

* **core:** Added ability to restart babblebot for updates ([8107a2c](https://github.com/bendavies99/BabbleBot-Server/commit/8107a2ccd683c5aef49b467db8d14a7dc8d5ba60))
* **updates:** Added a auto-restart feature ([522e4b4](https://github.com/bendavies99/BabbleBot-Server/commit/522e4b4d67f6a4b77b7d650fb367d329e57e0d58))

## [2.0.3](https://github.com/bendavies99/BabbleBot-Server/compare/v2.0.2...v2.0.3) (2020-03-30)


### Bug Fixes

* **app:** Added ability to shutdown bot for updates ([74762d9](https://github.com/bendavies99/BabbleBot-Server/commit/74762d967956f59af1bf0456d72586c8bb483c05))
* **update:** Set copied file as executable ([0dc364f](https://github.com/bendavies99/BabbleBot-Server/commit/0dc364f32c9b9723b5093a30405a27b9ecff90b7))

## [2.0.2](https://github.com/bendavies99/BabbleBot-Server/compare/v2.0.1...v2.0.2) (2020-03-30)


### Bug Fixes

* **update:** Delete old files on exit ([5353e39](https://github.com/bendavies99/BabbleBot-Server/commit/5353e396ae59bd50f8734693696ebaf2e31694f4))

## [2.0.1](https://github.com/bendavies99/BabbleBot-Server/compare/v2.0.0...v2.0.1) (2020-03-30)


### Bug Fixes

* High cpu usage on 8+ threads open for announcement service ([2ca97ab](https://github.com/bendavies99/BabbleBot-Server/commit/2ca97abbb86ca45ff282d760d6e7c4033accc2d9))

# [2.0.0](https://github.com/bendavies99/BabbleBot-Server/compare/v1.2.7...v2.0.0) (2020-03-29)


### Bug Fixes

* **agent:** Stopped using System.out.println and us now using slf4j ([1796981](https://github.com/bendavies99/BabbleBot-Server/commit/17969816ffd64d2b15f434595092645a01c140a3))
* **command-dispatcher:** Added commands like back ([a149056](https://github.com/bendavies99/BabbleBot-Server/commit/a149056975a0f8bf9a673521449227bca1b4f731))
* **command-dispatcher:** Failing middleware now stops command ([c2bee8e](https://github.com/bendavies99/BabbleBot-Server/commit/c2bee8e677b69cd9702a0cdf3014e4b5e375b4b8))
* **command-dispatcher:** Fix on usage error not showing up ([ad19669](https://github.com/bendavies99/BabbleBot-Server/commit/ad196695bc0b69e715d40385e9788095a44ff634))
* **core:** Removed failing middleware error ([7009ffd](https://github.com/bendavies99/BabbleBot-Server/commit/7009ffd9664d0ef665f33650247878e5d76967de))
* **message-parser:** Remove namespaces with - in value ([27650b2](https://github.com/bendavies99/BabbleBot-Server/commit/27650b2d52cdf791ac0d38faa8010c9dc988218d))
* **plugins:** Added ability to use root namespace ([1c87de8](https://github.com/bendavies99/BabbleBot-Server/commit/1c87de8cb89b5bf63116dd89e6e016f1ba2f7990))
* **plugins:** Added commandexample decorator to generate examples ([ca1bf50](https://github.com/bendavies99/BabbleBot-Server/commit/ca1bf50e4bfd7b1e79f85587a37b85cae4a90d02))
* **plugins:** Fixed Ignoring system broke on fresh install ([8f628c9](https://github.com/bendavies99/BabbleBot-Server/commit/8f628c9cc198d0ffc79a9487787cd795567ad27b))
* **plugins:** Loading plugins, no class errors ([a92b873](https://github.com/bendavies99/BabbleBot-Server/commit/a92b8736983d56e214d440775ba2cb66ce5f9613))
* **plugins:** Removed events being required ([b14a45f](https://github.com/bendavies99/BabbleBot-Server/commit/b14a45fa64851c4ea55ba283f1a90bd20829a627))
* Allow for empty parameters ([f7eff91](https://github.com/bendavies99/BabbleBot-Server/commit/f7eff919d8aa9893a54367b54db24fc39aa48a09))
* bot not saying command not found ([70a18b1](https://github.com/bendavies99/BabbleBot-Server/commit/70a18b14f1e5112558dc4c794ed27981f62b4c70))
* Handle null responses correctly ([481387f](https://github.com/bendavies99/BabbleBot-Server/commit/481387f6486d65491f9a4ad81bf26d134488aaea))


### Code Refactoring

* **core:** added a new version to docs ([0de0d44](https://github.com/bendavies99/BabbleBot-Server/commit/0de0d44cf911f7de5feeb4eb06bedaa83cd071e0))


### Features

* **announcements:** Added a update announcement service ([74864b7](https://github.com/bendavies99/BabbleBot-Server/commit/74864b7b5a5dfe339d47cdafe8df789728ff460b))
* **command-response:** added ability to respond to commands ([8d4027a](https://github.com/bendavies99/BabbleBot-Server/commit/8d4027a50027335910237f9d22a54c39647a363e))
* **commands:** Allow to test for non-empty parameter ([48196e4](https://github.com/bendavies99/BabbleBot-Server/commit/48196e440603ad3e85a0faffb1093131671e9a4d))
* **commands:** Default properties for embed response ([29e7057](https://github.com/bendavies99/BabbleBot-Server/commit/29e7057424ef247475802dae33ba90b267c81fb2))
* **commands:** Refactored Commands system ([067f3a4](https://github.com/bendavies99/BabbleBot-Server/commit/067f3a4bac9f63ef7577a3bb0c1781323e9ebe0f))
* **core:** Refactored help, command and added new command annotations ([dd2a6be](https://github.com/bendavies99/BabbleBot-Server/commit/dd2a6be6f2fc43bdaa966ca8622ba5e79ef217e1))
* **gitcz:** Added conventional commits cli ([4c0ea41](https://github.com/bendavies99/BabbleBot-Server/commit/4c0ea4186f6e63c5edc25309f51e7f9912beb04a))
* **plugin:** Added plugin middleware ([7d2af4c](https://github.com/bendavies99/BabbleBot-Server/commit/7d2af4cad4d95e87fdc26393fd6ae76c7cb2ce75))
* **plugins:**  Refactored plugins to match new command system ([a31f90d](https://github.com/bendavies99/BabbleBot-Server/commit/a31f90dfc130c8c020b4ffcae5a70c9caf4d4d5a))
* **plugins:** Added a plugin decorator to make plugin creation easier ([8bb39e0](https://github.com/bendavies99/BabbleBot-Server/commit/8bb39e027d83587859155f2dc6f7a40daaca8969))
* **plugins:** Added ability to import plugins ([21133c9](https://github.com/bendavies99/BabbleBot-Server/commit/21133c9f18531c34ef86143359f7f9688b77d19a))
* **plugins:** Added an easy to make plugin-specific config ([f7fc32f](https://github.com/bendavies99/BabbleBot-Server/commit/f7fc32f85ed04936ab2ba006f0c93542a0979409))
* **plugins:** Added semantic version library for testing ([568fa8b](https://github.com/bendavies99/BabbleBot-Server/commit/568fa8b21ef65cacedfab00d14d6994f89e76578))
* **updating:** Added a autoupdate service ([05453d7](https://github.com/bendavies99/BabbleBot-Server/commit/05453d7f085d9119871f533446d30b26e45e1449))


### BREAKING CHANGES

* **core:** Command System Refactor, Plugin System overhaul, Automatic updates

## [1.2.7](https://github.com/bendavies99/BabbleBot-Server/compare/v1.2.6...v1.2.7) (2020-03-20)


### Bug Fixes

* Version not added to resources so app failing to run ([ba12038](https://github.com/bendavies99/BabbleBot-Server/commit/ba120388263bff8de71f696488a7c254eec0243b))

## [1.2.6](https://github.com/bendavies99/BabbleBot-Server/compare/v1.2.5...v1.2.6) (2020-03-20)


### Bug Fixes

* Use JDK 11 because that's the java requirement ([fd9dbed](https://github.com/bendavies99/BabbleBot-Server/commit/fd9dbed7e1c916df51d07905d4671acbd47570af))

## [1.2.5](https://github.com/bendavies99/BabbleBot-Server/compare/v1.2.4...v1.2.5) (2020-03-20)


### Bug Fixes

* Github releases uploading all archives built ([2dfbb0d](https://github.com/bendavies99/BabbleBot-Server/commit/2dfbb0df880379c75a172fb5f9b50030c6ea43ae))

## [1.2.4](https://github.com/bendavies99/BabbleBot-Server/compare/v1.2.3...v1.2.4) (2020-03-20)


### Bug Fixes

* Github releases uploading all archives built ([4198c26](https://github.com/bendavies99/BabbleBot-Server/commit/4198c2672a0733dcad4324f10dd0b3a30aaa83d7))

## [1.2.3](https://github.com/bendavies99/BabbleBot-Server/compare/v1.2.2...v1.2.3) (2020-03-20)


### Bug Fixes

* If javadoc fails don't fail publish ([e20e90a](https://github.com/bendavies99/BabbleBot-Server/commit/e20e90a32d43f49689f99c916f389381e57d1103))

## [1.2.2](https://github.com/bendavies99/BabbleBot-Server/compare/v1.2.1...v1.2.2) (2020-03-20)


### Bug Fixes

* Bintray not publishing on deploy ([7597f38](https://github.com/bendavies99/BabbleBot-Server/commit/7597f389570c05500c433f9b939d810c3c4ad0eb))
* Github releases uploading all archives built ([b2366f1](https://github.com/bendavies99/BabbleBot-Server/commit/b2366f1a1c81d371e50cb03134b910cce09e7998))
* Releasing empty sources and javadoc files ([53c4666](https://github.com/bendavies99/BabbleBot-Server/commit/53c4666e3258f16a474b7df84ee76f65da01115c))

## [1.2.1](https://github.com/bendavies99/BabbleBot-Server/compare/v1.2.0...v1.2.1) (2020-03-20)


### Bug Fixes

* Bintray not publishing on deploy ([d2fccd4](https://github.com/bendavies99/BabbleBot-Server/commit/d2fccd4a74e98a0d8777b8b02403b4f12fa7801b))
* Github releases uploading all archives built ([bca00c9](https://github.com/bendavies99/BabbleBot-Server/commit/bca00c98c984aecfabb72cc8c460809163d3046f))

# [1.2.0](https://github.com/bendavies99/BabbleBot-Server/compare/v1.1.0...v1.2.0) (2020-03-20)


### Bug Fixes

*  Merging conflicts ([92f683e](https://github.com/bendavies99/BabbleBot-Server/commit/92f683eb95194159cf8c7f84bec056ad4077e243))
*  Merging conflicts ([ece2535](https://github.com/bendavies99/BabbleBot-Server/commit/ece2535ff44780d0ee6d6ddade946f1ad501095e))
* Fixed Zip and Tar to github releases to have current release ([eae52be](https://github.com/bendavies99/BabbleBot-Server/commit/eae52bec813afe45199eb12fc71891187c3cd903))
* Fixed Zip and Tar to github releases to have current release ([1551b70](https://github.com/bendavies99/BabbleBot-Server/commit/1551b705d7d42f93d3c3cc65a95e2740f9365b9b))


### Features

* Added Zip and Tar to github releases ([eb54e09](https://github.com/bendavies99/BabbleBot-Server/commit/eb54e091d7480988a3d4c1447619937730843f1d))
* Added Zip and Tar to github releases ([cb0c0a8](https://github.com/bendavies99/BabbleBot-Server/commit/cb0c0a80fc5158354ea27c9a8e293bfc8ba180af))

# [1.1.0](https://github.com/bendavies99/BabbleBot-Server/compare/v1.0.0...v1.1.0) (2020-03-19)


### Features

* Added Zip and Tar to github releases ([161b21c](https://github.com/bendavies99/BabbleBot-Server/commit/161b21c12a658b2379255bd75ddf60c95f31b2f2))

# 1.0.0 (2020-03-19)


### Bug Fixes

* Test patch release ([103be54](https://github.com/bendavies99/BabbleBot-Server/commit/103be5464293b0ca84159d2691c404cf9f67ecef))
