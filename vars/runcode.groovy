def call(){
   echo "Running Container..."
   withCredentials([file(credentialsId: 'ticket-system-env', variable: 'ENV_FILE')]) {
   sh '''
   cp $ENV_FILE .env
   docker compose down || true
   docker compose up -d --build
   '''
   }
}
