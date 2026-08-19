package p417R2;

import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1112xm.AbstractC21304h;
import p909nm.C17689w;

/* JADX INFO: renamed from: R2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6793e extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21801Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC16546n f21802Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6793e(int i10, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f21801Y = i10;
        switch (i10) {
            case 1:
                this.f21802Z = (AbstractC16546n) interfaceC1426a;
                super(0);
                break;
            default:
                this.f21802Z = (AbstractC16546n) interfaceC1426a;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f21801Y) {
            case 0:
                File file = (File) this.f21802Z.invoke();
                if (AbstractC21304h.m21642e(file).equals("preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            default:
                try {
                    return (List) this.f21802Z.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C17689w.f56480Y;
                }
        }
    }
}
