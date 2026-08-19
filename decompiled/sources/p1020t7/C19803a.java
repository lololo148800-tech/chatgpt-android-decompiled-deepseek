package p1020t7;

import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: t7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19803a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C19803a f62826Z = new C19803a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19803a f62827o0 = new C19803a(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C19803a f62828p0 = new C19803a(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C19803a f62829q0 = new C19803a(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C19803a f62830r0 = new C19803a(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C19803a f62831s0 = new C19803a(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C19803a f62832t0 = new C19803a(1, 6);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62833Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19803a(int i10, int i11) {
        super(i10);
        this.f62833Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f62833Y) {
            case 0:
                File safeCall = (File) obj;
                AbstractC16544l.m18094g(safeCall, "$this$safeCall");
                return Boolean.valueOf(safeCall.canRead());
            case 1:
                File safeCall2 = (File) obj;
                AbstractC16544l.m18094g(safeCall2, "$this$safeCall");
                return Boolean.valueOf(safeCall2.canWrite());
            case 2:
                File safeCall3 = (File) obj;
                AbstractC16544l.m18094g(safeCall3, "$this$safeCall");
                return Boolean.valueOf(safeCall3.delete());
            case 3:
                File file = (File) obj;
                AbstractC16544l.m18094g(file, YladLSetV.WdKZiEdillcw);
                return Boolean.valueOf(file.exists());
            case 4:
                File safeCall4 = (File) obj;
                AbstractC16544l.m18094g(safeCall4, "$this$safeCall");
                return Boolean.valueOf(safeCall4.isDirectory());
            case 5:
                File safeCall5 = (File) obj;
                AbstractC16544l.m18094g(safeCall5, "$this$safeCall");
                return Long.valueOf(safeCall5.length());
            default:
                File safeCall6 = (File) obj;
                AbstractC16544l.m18094g(safeCall6, "$this$safeCall");
                return Boolean.valueOf(safeCall6.mkdirs());
        }
    }
}
