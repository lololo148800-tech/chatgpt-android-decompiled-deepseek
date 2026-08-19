package p826j6;

import org.json.JSONObject;

/* JADX INFO: renamed from: j6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C16158l {

    /* JADX INFO: renamed from: a */
    public final int f50155a;

    /* JADX INFO: renamed from: b */
    public final int f50156b;

    public C16158l(JSONObject jSONObject) {
        this.f50155a = jSONObject.getInt("commitmentPaymentsCount");
        this.f50156b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
