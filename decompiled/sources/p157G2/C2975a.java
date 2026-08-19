package p157G2;

/* JADX INFO: renamed from: G2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2975a extends AbstractC2976b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2975a(String str, int i10) {
        super("android.credentials.CreateCredentialException.TYPE_USER_CANCELED", str);
        switch (i10) {
            case 2:
                super("android.credentials.CreateCredentialException.TYPE_UNKNOWN", str);
                break;
            default:
                break;
        }
    }
}
