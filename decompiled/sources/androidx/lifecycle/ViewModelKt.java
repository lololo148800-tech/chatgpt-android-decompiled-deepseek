package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17308k;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p867l8.C16831c;
import p956q3.C18621a;
import p972qm.C18777j;
import p972qm.InterfaceC18776i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"lifecycle-viewmodel_release"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class ViewModelKt {

    /* JADX INFO: renamed from: a */
    public static final C16831c f33430a = new C16831c();

    /* JADX INFO: renamed from: a */
    public static final C18621a m12143a(ViewModel viewModel) {
        C18621a c18621a;
        AbstractC16544l.m18094g(viewModel, "<this>");
        synchronized (f33430a) {
            c18621a = (C18621a) viewModel.m12142d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c18621a == null) {
                InterfaceC18776i interfaceC18776i = C18777j.f59682Y;
                try {
                    C3516e c3516e = AbstractC0593T.f1824a;
                    interfaceC18776i = AbstractC2935m.f8797a.f3819q0;
                } catch (IllegalStateException | C17308k unused) {
                }
                C18621a c18621a2 = new C18621a(interfaceC18776i.plus(AbstractC0575H.m1176e()));
                viewModel.m12140b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c18621a2);
                c18621a = c18621a2;
            }
        }
        return c18621a;
    }
}
