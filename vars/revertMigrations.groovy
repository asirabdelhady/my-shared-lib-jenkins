def call(){
    script{
        sh'''
            SUCCESS=$(curl --insecure https://kvdb.io/SVgjzaE1tssMb4vzCtfZ3r/migration_${BUILD_ID})
                if [[ $SUCCESS == 1 ]];
                then
                    cd ./backend
                    npm install
                    npm run migration:revert
                fi
        '''
    }
}