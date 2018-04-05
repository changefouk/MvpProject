
package mvpproject.com.mbox.mvpproject.data.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieNowPlayingModel {

    @SerializedName("resultModels")
    @Expose
    private List<ResultModel> resultModels = null;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;
    @SerializedName("datesModel")
    @Expose
    private DatesModel datesModel;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;

    public List<ResultModel> getResultModels() {
        return resultModels;
    }

    public void setResultModels(List<ResultModel> resultModels) {
        this.resultModels = resultModels;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public DatesModel getDatesModel() {
        return datesModel;
    }

    public void setDatesModel(DatesModel datesModel) {
        this.datesModel = datesModel;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

}
