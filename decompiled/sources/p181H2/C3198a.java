package p181H2;

/* JADX INFO: renamed from: H2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3198a {

    /* JADX INFO: renamed from: a */
    public final String f9650a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3198a(int i10) {
        this("androidx.credentials.TYPE_ABORT_ERROR");
        switch (i10) {
            case 1:
                this("androidx.credentials.TYPE_CONSTRAINT_ERROR");
                break;
            case 3:
                this("androidx.credentials.TYPE_DATA_ERROR");
                break;
            case 4:
                this("androidx.credentials.TYPE_ENCODING_ERROR");
                break;
            case 10:
                this("androidx.credentials.TYPE_INVALID_STATE_ERROR");
                break;
            case 12:
                this("androidx.credentials.TYPE_NETWORK_ERROR");
                break;
            case 14:
                this("androidx.credentials.TYPE_NOT_ALLOWED_ERROR");
                break;
            case 16:
                this("androidx.credentials.TYPE_NOT_READABLE_ERROR");
                break;
            case 17:
                this("androidx.credentials.TYPE_NOT_SUPPORTED_ERROR");
                break;
            case 22:
                this("androidx.credentials.TYPE_SECURITY_ERROR");
                break;
            case 24:
                this("androidx.credentials.TYPE_TIMEOUT_ERROR");
                break;
            case 26:
                this("androidx.credentials.TYPE_UNKNOWN_ERROR");
                break;
            default:
                break;
        }
    }

    public C3198a(String str) {
        this.f9650a = str;
    }
}
