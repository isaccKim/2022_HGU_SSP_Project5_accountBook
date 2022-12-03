package com.my.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;




@Repository
public class BoardDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public int insertBoard(BoardVO vo) {
        String sql = "insert into BOARD (userid,password,username,card, content,price,installment) values ("
                + "'" + vo.getUserid() + "',"
                + "'" + vo.getPassword() + "',"
                + "'" + vo.getUsername() + "',"
                + "'" + vo.getCard() + "',"
                + "'" + vo.getContent() + "',"
                + "'" + vo.getPrice() + "',"
                + "'" + vo.getInstallment() + "')";
        return jdbcTemplate.update(sql);
    }

    public int deleteBoard(int seq){
        String sql = "delte from Board where sid = " + seq;
        return jdbcTemplate.update(sql);
    }

    public int updateBoard(BoardVO vo){
        String sql = "update BOARD set name='" + vo.getUsername()+"',"
                +"card='" + vo.getContent()+"',"+"content='" + vo.getContent()+"',"+"price='"+vo.getPrice()
                +"',"+"installment'"+vo.getPrice()+"'where seq="+vo.getSeq();
        return jdbcTemplate.update(sql);
    }
    public BoardVO getBoard(int seq){
        String sql = "select * from BOARD where seq=" + seq;
        return  jdbcTemplate.queryForObject(sql,new BoardRowMapper());
    }
    public List<BoardVO> getBoardList() {
        String sql = "select 8from BOARD order by regdate desc";
        return jdbcTemplate.query(sql, new BoardRowMapper());
    }
}



