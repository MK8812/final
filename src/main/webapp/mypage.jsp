<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����������</title>
<style type="text/css">
th, td{
	dispaly: inline-block;
	font-size: 0.8rem;
}
td input[type="text"]{
	width: 350px; height:50px;
	border: 1px solid #d1d1d1;
}
th{
    margin: 10px 0 8px;
   	font-size: 1.0rem;
   	font-weight: 400;
    text-align: left;
}	
td input[type="button"]{ 
   	background-color:rgb(75, 161, 231);
   	border: 1px solid gray;
    cursor: pointer;
    width: 100px; height: 30px;
}
</style>
<script type="text/javascript">
	function updateuser(userno){
		location.href="logincontroller.jsp?command=updateform&userno="+userno;
	}
	function deleteuser(userno){
		var returnValue = confirm("������ Ż���Ͻðڽ��ϱ�?");
		if(returnValue == true){
			location.href="logincontroller.jsp?command=deleteuser&userno="+userno;
		}
	}
</script>
</head>
<body>
<header style="text-align:center; margin-top:20px;">
	���
</header>
<br><br><hr>
<section>
	<div style="text-align: center; margin-top: 30px;">	
		<h1>�� ���� ����</h1>
	</div>
	<div class="user_info">
		<form action="" method="post">
			<table align="center" method="post" cellpadding="5">
				<tr>
					<th>���̵�</th>
					<td><input type="text" id="id" name="userId" placeholder="KH" style="width:300px;"></td>
				</tr>
				<tr>
					<th>�̸�</th>
					<td><input type="text" id="name" name="userName" placeholder="ȫ�浿" style="width:300px;"></td>
				</tr>
				<tr>
					<th>�������</th>
					<td><input type="text" id="date" name="Date" placeholder="2021.12.10" style="width:300px;"></td>
				</tr>
				<tr>
					<th>�̸���</th>
					<td><input type="text" id="email" name="Email" placeholder="dknkdw@naver.com" style="width:300px;"></td>
				</tr>
				<tr>
					<th>�ڵ���</th>
					<td><input type="text" id="phone" name="Phone" placeholder="010-1234-5678" style="width:300px;"></td>
				</tr>
				<tr>
					<th>�ڱ�Ұ�</th>
					<td><textarea cols="39" rows="10" placeholder="�ȳ��ϼ��� ȫ�浿�Դϴ�."></textarea>></td>
				</tr>
				<tr>
					<td colspan="10" style="text-align: right;">
						<input type="button" value="����" onclick="">
						<input type="button" value="ȸ��Ż��" onclick="">
					</td>
				</tr>
			</table>
		</form>
	</div>
</section>
<hr><br><br>
<footer style="text-align:center;">Ǫ��</footer>
</body>
</html>