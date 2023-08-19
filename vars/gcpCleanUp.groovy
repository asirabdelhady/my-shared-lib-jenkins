def call(){
        script {
        def projectId = 'udapeople-new-395001'
        def instanceName = 'backend-server'
        def bucketName = "udapeople-bucket"
        
        sh """
            gcloud config set project ${projectId}
            gcloud compute instances delete ${instanceName} --quiet
            gsutil rm -r gs://${bucketName}
        """
    }
}