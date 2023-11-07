import os

# Function to delete files with a specific extension in a directory
def delete_files_with_extension(directory, extension):
    # Walk through the directory and its subdirectories
    for root, dirs, files in os.walk(directory):
        # Iterate through each file in the current directory
        for file in files:
            # Check if the file has the desired extension
            if file.endswith(extension):
                # Create the full path to the file
                file_path = os.path.join(root, file)
                # Remove the file
                os.remove(file_path)
                # Print the path of the deleted file
                print(f"Deleted {file_path}")

# Define the directory path and file extension
directory_path = r"E:\projects\workspace for projects\CODING STANDARD FOLLOW"
file_extension = ".class"

# Call the function to delete files with the specified extension
delete_files_with_extension(directory_path, file_extension)
