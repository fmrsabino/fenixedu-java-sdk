package org.fenixedu.sdk.android;

import org.fenixedu.sdk.Authorization;
import org.fenixedu.sdk.FenixEduClient;

import com.google.gson.JsonObject;

public class GetPersonPaymentsAsyncTask extends AuthorizedFenixEduAsyncTask<Void, JsonObject> {

    public GetPersonPaymentsAsyncTask(FenixEduClient client, Authorization authorization) {
        super(client, authorization);
    }

    public GetPersonPaymentsAsyncTask(FenixEduClient client, PostExecuteCallback postExecuteCallback, Authorization authorization) {
        super(client, postExecuteCallback, authorization);
    }

    @Override
    protected JsonObject executeInBackground(Void... params) {
        return getClient().getPersonPayments(getAuthorization());
    }
}
