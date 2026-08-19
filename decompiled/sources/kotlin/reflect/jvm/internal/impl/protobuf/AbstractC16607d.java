package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC16607d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52759a;

    static {
        int[] iArr = new int[WireFormat.JavaType.values().length];
        f52759a = iArr;
        try {
            iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f52759a[WireFormat.JavaType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
