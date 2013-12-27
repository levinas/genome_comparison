package us.kbase.genomecomparison;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import us.kbase.common.service.JsonClientCaller;
import us.kbase.common.service.JsonClientException;

/**
 * <p>Original spec-file module name: GenomeComparison</p>
 * <pre>
 * </pre>
 */
public class GenomeComparisonClient {
    private JsonClientCaller caller;

    public GenomeComparisonClient(URL url) {
        caller = new JsonClientCaller(url);
    }

	public void setConnectionReadTimeOut(Integer milliseconds) {
		this.caller.setConnectionReadTimeOut(milliseconds);
	}

    /**
     * <p>Original spec-file function name: blast_proteomes</p>
     * <pre>
     * </pre>
     * @param   input   instance of type {@link us.kbase.genomecomparison.BlastProteomesParams BlastProteomesParams} (original type "blast_proteomes_params")
     * @return   parameter "job_id" of String
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public String blastProteomes(BlastProteomesParams input) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(input);
        TypeReference<List<String>> retType = new TypeReference<List<String>>() {};
        List<String> res = caller.jsonrpcCall("GenomeComparison.blast_proteomes", args, retType, true, false);
        return res.get(0);
    }
}