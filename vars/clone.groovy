def call(){
  echo "Cloning..."
                git url: "https://github.com/Tusharjamdade/ticket-system.git", branch: "main"
                echo "Running Docker Build"
                // sh "docker build -t ticket-system ."
                echo "Build done"
}
