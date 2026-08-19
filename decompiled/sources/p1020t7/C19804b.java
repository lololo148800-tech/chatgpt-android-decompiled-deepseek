package p1020t7;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1112xm.AbstractC21304h;
import p1112xm.C21305i;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC7958O5;
import p544W9.AbstractC8746y3;

/* JADX INFO: renamed from: t7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C19804b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62834Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Charset f62835Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19804b(int i10, Charset charset) {
        super(1);
        this.f62834Y = i10;
        this.f62835Z = charset;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f62834Y) {
            case 0:
                File safeCall = (File) obj;
                AbstractC16544l.m18094g(safeCall, "$this$safeCall");
                Charset charset = this.f62835Z;
                AbstractC16544l.m18094g(charset, "charset");
                ArrayList arrayList = new ArrayList();
                AbstractC21304h.m21641d(safeCall, charset, new C21305i(0, arrayList));
                return arrayList;
            default:
                File safeCall2 = (File) obj;
                AbstractC16544l.m18094g(safeCall2, "$this$safeCall");
                Charset charset2 = this.f62835Z;
                AbstractC16544l.m18094g(charset2, "charset");
                InputStreamReader inputStreamReader = new InputStreamReader(AbstractC8746y3.m9492c(safeCall2, new FileInputStream(safeCall2)), charset2);
                try {
                    String strM8249b = AbstractC7958O5.m8249b(inputStreamReader);
                    AbstractC7942M5.m8232a(inputStreamReader, null);
                    return strM8249b;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(inputStreamReader, th2);
                        throw th3;
                    }
                }
        }
    }
}
