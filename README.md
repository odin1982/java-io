# JAVA-IO(File Handling)
## PACKAGE
	java.io is used
	Uses the concept of stream to make I/O operation fast
## STREAM
	Stream is a sequence of data
	- System.out: OutputStream
	- System.in:	InputStream
	- System.err:	ErrorStream
	

										(InputStream)						  	(OutpuStream)
Source	--------------------------------> IOIOIOIIOO -------> Java Application 	---------------->
(textfile,console cmd,network(socket))	(Read Operation)						(write operation)


## File
	An instance of a File class represents the pathname of a particular file or directory on the fylesystem. The File class 	cannot read and write data within a file, although it can be passed as a reference to may stream classes to read or write 	data.
	
	The File class can be used to represent directories as well as files.

## OUPUTSTREAM CLASS
	void write(int) throws IOException
	void write(byte[]) throws IOException
	void flush() throws IOException
	void close()  throws IOException
## INPUTSTREAM CLASS
	int read() throws IOException
	int avallable() throws IOException
	void close() thorws IOException
	
## FILEINPUTSTREAM ANS FILEOUTPUTSTREAM CLASS
	Used to read and write data in a file
	Prefer this when primitive datatype values are to be written
	
## BUFFEREDOUTPUTSTREAM
	Used internal buffer to store data
	Fast and more efficent

## BUFFEREDINPUTSTREAM
	Used to read information from stream.
	Uses Buffer mechanism to make the performance fast.
	
## FILEREADER AND FILEWRITER
	Used to write and read data from text files.
	Character oriented classes.
	
## BYTEARRAYOUTPUTSTREAM
	Used to write data into multiple files
	data is written into byte array that can be written to multiple stream
	
