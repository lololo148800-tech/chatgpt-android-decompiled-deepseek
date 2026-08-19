package p508Uj;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p729ej.InterfaceC13427r;
import p841k.AbstractC16283c;

/* JADX INFO: renamed from: Uj.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C7707o implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final AbstractC16283c f24278b;

    /* JADX INFO: renamed from: c */
    public final Context f24279c;

    /* JADX INFO: renamed from: d */
    public final String f24280d;

    /* JADX INFO: renamed from: e */
    public final C7693a f24281e;

    /* JADX INFO: renamed from: f */
    public final C7703k f24282f;

    /* JADX INFO: renamed from: g */
    public final List f24283g;

    /* JADX INFO: renamed from: h */
    public final StepStyles.UiStepStyle f24284h;

    public C7707o(AbstractC16283c passportNfcReaderLauncher, Context context, String str, C7693a c7693a, C7703k c7703k, List list, StepStyles.UiStepStyle uiStepStyle) {
        AbstractC16544l.m18094g(passportNfcReaderLauncher, "passportNfcReaderLauncher");
        this.f24278b = passportNfcReaderLauncher;
        this.f24279c = context;
        this.f24280d = str;
        this.f24281e = c7693a;
        this.f24282f = c7703k;
        this.f24283g = list;
        this.f24284h = uiStepStyle;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        return otherWorker instanceof C7707o;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C7706n(this, null));
    }
}
