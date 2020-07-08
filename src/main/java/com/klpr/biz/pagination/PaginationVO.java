package com.klpr.biz.pagination;

/**
 * @author ahn
 *
 */
public class PaginationVO {
	
	//한 페이지 당 게시물 수 
	public static final int page_scale=5;
	
	//화면 당 페이지 수
	public static final int block_scale=3;
	
	
	
	/** 한 페이지 출력될 게시글 수 **/
    private int rowSize=5;
	
	/** 한 화면에 출력될 페이지 수**/
	private int pageSize = 6;
    

    
    /** 현재 페이지 **/
    private int curPage = 1;
    
    /** 현재 블럭(range) **/
    private int curRange = 1;
    
    /** 총 게시글 수 **/
//  private int listCnt;
//	private int totalCount;
//  private int totalList;
	private int totalCnt;	
    
       
    /** 총 페이지 수 **/
	private int totalPage;
//  private int pageCnt;
//  totalCount/pageSize 
    
    
        
    /** 총 블럭(range) 수 **/
    private int rangeCnt;
    
    /** 시작 페이지 **/
    private int startPage = 1;
    
    /** 끝 페이지 **/
    private int endPage = 1;
    
    /** 시작 index **/
    private int startIndex = 0;
    
    /** 이전 페이지 **/
    private int prevPage;
    
    /** 다음 페이지 **/
    private int nextPage;
    
    private int startRow;
    private int endRow;
	
    
    
    public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getCurRange() {
		return curRange;
	}
	public void setCurRange(int curRange) {
		this.curRange = (int)((curPage-1)/pageSize) + 1;
	}
	public int getTotalCnt() {
		return totalCnt;
	}
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		 this.totalPage = (int) Math.ceil(totalCnt*1.0/pageSize);
	}
	public int getRangeCnt() {
		return rangeCnt;
	}
	public void setRangeCnt(int totalPage) {
		 this.rangeCnt = (int) Math.ceil(totalPage*1.0/pageSize);
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int curPage) {
		  this.startIndex = (curPage-1) * pageSize;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public static int getPageScale() {
		return page_scale;
	}
	public static int getBlockScale() {
		return block_scale;
	}
    

    
	public int getRowSize() {
		return rowSize;
	}
	public void setRowSize(int rowSize) {
		this.rowSize = rowSize;
	}
	
	public PaginationVO(){
	}
	public PaginationVO(int totalCnt, int curPage){
        		
        // 총 게시물 수와 현재 페이지를 Controller로 부터 받아온다.
        
		//현재페이지
        this.setCurPage(curPage);
		//setCurPage(curPage);
                       
        //총 게시물 수        
        this.setTotalCnt(totalCnt);
        //setTotalCnt(totalCnt);
        
        //전체 페이지 수
        this.setTotalPage(totalCnt/this.getRowSize());
              
        this.totalPage = getTotalCnt() / rowSize;
                
        //총 게시물 수%한 페이지당 게시글 수( 나머지 발생 시 1++)
        if (totalCnt % rowSize > 0) {
            totalPage++;
        }
                
      //전체페이지보다 현재페이지가 크면 현재페이지를 전체페이지(마지막페이지)로 변경
        if (totalPage < curPage) {

            curPage = totalPage;
        }
       
        //시작페이지
        this.startPage = (curRange - 1) * pageSize + 1;
        
        //끝 페이지	
        this.endPage = startPage + pageSize - 1;
                
        //끝 페이지가 총 페이지보다 더 클 경우, 끝 페이지를 총 페이지로 변경
        if(endPage > totalPage){
            this.endPage = totalPage;
        }
        
        this.prevPage = curPage - 1;
        this.nextPage = curPage + 1;

        
        //시작 ROW
        //this.startRow  =(curPage -1) * rowSize +1;
        //끝 ROW
        //this.endRow = startRow + rowSize - 1;
        
    }

}
