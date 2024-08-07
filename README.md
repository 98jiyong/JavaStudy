# 깃 연동
| 참고 : https://beam-maru.tistory.com/116<br><br>
![git_init](https://github.com/user-attachments/assets/f572e79b-0ac7-493e-b5fc-2e77defb3508)<br>
설치하고자 하는 폴더에 <strong>`[git init]`</strong> 을 한 후 <strong>`[user.name]`</strong>과 <strong>`[user.email]`</strong>을 작성하기<br>
<br>
![git_remote changeBranch](https://github.com/user-attachments/assets/4e6d9060-315f-45cd-ba2f-911d58324a7e)<br>
연결하고자 하는 원격저장소를 remote한다 <em>(단, 브랜치 이름이 다르다면 브랜치 이름을 맞춰줘야함)</em><br>
`git branch main` => <strong>main</strong>이라는 브랜치 생성<br>
`git branch` => 브랜치 확인<br>
`git checkout main` => <strong>main</strong>으로 브랜치 변경
`git remote add [이름][URL]` => 등록된 원격 저장소의 이름을 변경<br>
`git remote add origin 'URL'` => <strong>origin</strong>이라는 이름으로 URL에 대한 원격 저장소 연결<br>
<br>
![git_push](https://github.com/user-attachments/assets/543cb0c8-7fc0-4c6d-9107-cc9c7bd68719)<br>
푸쉬하는 순서는 add -> commit -> push <br>
`git add [파일 혹은 디렉토리 경로]` => [파일 혹은 디렉토리]를 스테이징 영역으로 이동<br>
`git commit -m '[메모]'` => 스테이징 영역으로 이동한 파일들에 대한 변경사항을 남김<br>
`git push [remote] [branch]` => 로컬 저장소에서 원격 저장소로 이동  *-f : 강제실행<br>
<br>
![git_fetch pull](https://github.com/user-attachments/assets/637f83df-548b-4f56-8e5e-8b79161a9232)<br>
원격 저장소에서 로컬 저장소로 가져올 때에는 fetch와 pull이 있다.<br>
`git fetch` => fetch는 원격 저장소에서 변경된 정보를 확인할 뿐 가져오지는 않는다.<br>
`git pull [remote] [branch]` => 원격 저장소에 변경된 내용 뿐 만 아니라 최신 정보도 로컬 저장소로 가져옴<br>

# Java Study
- [변수명 & 자료형](https://github.com/98jiyong/JavaStudy/blob/main/_00Variable/%EC%A0%95%EB%A6%AC%EB%85%B8%ED%8A%B8)
- [배열](https://github.com/98jiyong/JavaStudy/blob/main/_01Array/%EC%A0%95%EB%A6%AC%EB%85%B8%ED%8A%B8)
- [조건문](https://github.com/98jiyong/JavaStudy/blob/main/_02If/%EC%A0%95%EB%A6%AC%EB%85%B8%ED%8A%B8)
