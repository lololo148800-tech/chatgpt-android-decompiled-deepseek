package io.sentry.android.core;

import android.content.Context;
import android.util.TypedValue;
import com.openai.chatgpt.R;
import io.sentry.C15134J0;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15131I0;
import io.sentry.InterfaceC15137K0;
import io.sentry.InterfaceC15159S;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC15224f;
import io.sentry.instrumentation.file.C15378c;
import io.sentry.instrumentation.file.C15379d;
import io.sentry.instrumentation.file.InterfaceC15376a;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15447t;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0093v0;
import p1156zj.AbstractC22208y0;
import p1156zj.C22107K0;
import p1156zj.C22189r0;
import p310M9.C5311e;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p729ej.InterfaceC13418i;
import p802i6.InterfaceC14937c;
import p860l0.C16663C;

/* JADX INFO: renamed from: io.sentry.android.core.r */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15254r implements InterfaceC15137K0, InterfaceC15376a, InterfaceC15131I0, InterfaceC14937c, InterfaceC13418i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47621Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f47622Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f47623o0;

    public /* synthetic */ C15254r(Object obj, int i10, Object obj2) {
        this.f47621Y = i10;
        this.f47623o0 = obj;
        this.f47622Z = obj2;
    }

    @Override // p729ej.InterfaceC13418i
    /* JADX INFO: renamed from: B */
    public void mo3393B(Object obj) {
        AbstractC22208y0 it = (AbstractC22208y0) obj;
        C13421l c13421l = (C13421l) this.f47623o0;
        C22107K0 this$0 = (C22107K0) this.f47622Z;
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(it, "it");
        c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this$0, new C16663C(this$0, c13421l, it, 20)));
    }

    @Override // io.sentry.InterfaceC15131I0
    /* JADX INFO: renamed from: a */
    public void mo16300a(C5311e c5311e) {
        C0093v0 c0093v0 = (C0093v0) c5311e.f17486p0;
        C15524y1 c15524y1 = (C15524y1) this.f47623o0;
        if (c0093v0 == null) {
            c0093v0 = new C0093v0(c15524y1.getLogger());
            c5311e.f17486p0 = c0093v0;
        }
        if (c0093v0.f403Z) {
            C15134J0 c15134j0 = (C15134J0) this.f47622Z;
            C5311e c5311e2 = c15134j0.f47129q;
            C15425E c15425e = c15134j0.f47114b;
            C15447t c15447t = c15134j0.f47130r;
            c0093v0.m352v("sentry-trace_id", ((C15447t) c5311e2.f17484Z).toString());
            c0093v0.m352v("sentry-public_key", c15524y1.retrieveParsedDsn().f48043b);
            c0093v0.m352v("sentry-release", c15524y1.getRelease());
            c0093v0.m352v("sentry-environment", c15524y1.getEnvironment());
            if (!C15447t.f48216Z.equals(c15447t)) {
                c0093v0.m352v("sentry-replay_id", c15447t.toString());
            }
            c0093v0.m352v("sentry-user_segment", c15425e != null ? C0093v0.m337q(c15425e) : null);
            c0093v0.m352v("sentry-transaction", null);
            c0093v0.m352v("sentry-sample_rate", null);
            c0093v0.m352v("sentry-sampled", null);
            c0093v0.f403Z = false;
        }
    }

    @Override // io.sentry.instrumentation.file.InterfaceC15376a
    public Object call() throws IOException {
        switch (this.f47621Y) {
            case 3:
                return Integer.valueOf(((C15378c) this.f47623o0).f47961Y.read((byte[]) this.f47622Z));
            case 4:
                int i10 = ((C15378c) this.f47623o0).f47961Y.read();
                ((AtomicInteger) this.f47622Z).set(i10);
                return Integer.valueOf(i10 != -1 ? 1 : 0);
            default:
                FileOutputStream fileOutputStream = ((C15379d) this.f47623o0).f47963Y;
                byte[] bArr = (byte[]) this.f47622Z;
                fileOutputStream.write(bArr);
                return Integer.valueOf(bArr.length);
        }
    }

    @Override // io.sentry.InterfaceC15137K0
    /* JADX INFO: renamed from: f */
    public void mo390f(C15134J0 c15134j0) {
        GestureDetectorOnGestureListenerC15224f gestureDetectorOnGestureListenerC15224f = (GestureDetectorOnGestureListenerC15224f) this.f47623o0;
        InterfaceC15159S interfaceC15159S = (InterfaceC15159S) this.f47622Z;
        gestureDetectorOnGestureListenerC15224f.getClass();
        synchronized (c15134j0.f47125m) {
            if (c15134j0.f47113a == null) {
                c15134j0.m16307d(interfaceC15159S);
            } else {
                gestureDetectorOnGestureListenerC15224f.f47493c.getLogger().mo16298o(EnumC15375i1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC15159S.getName());
            }
        }
    }

    @Override // p802i6.InterfaceC14937c
    public Integer getValue() {
        C22189r0 this$0 = (C22189r0) this.f47623o0;
        AbstractC16544l.m18094g(this$0, "this$0");
        Context context = (Context) this.f47622Z;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return Integer.valueOf(typedValue.data);
    }
}
