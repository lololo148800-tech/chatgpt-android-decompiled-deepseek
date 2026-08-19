package p974qo;

import java.net.Proxy;

/* JADX INFO: renamed from: qo.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC18793i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f59735a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f59735a = iArr;
    }
}
