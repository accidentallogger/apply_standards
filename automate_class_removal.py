import os

#used to delete .class files
def delete_files_with_extension(directory, extension):
    for root, dirs, files in os.walk(directory):
        for file in files:
            if file.endswith(extension):
                file_path = os.path.join(root, file)
                os.remove(file_path)
                print(f"Deleted {file_path}")

directory_path = r"E:\projects\workspace for projects\CODING STANDARD FOLLOW"
file_extension = ".class"
delete_files_with_extension(directory_path, file_extension)
