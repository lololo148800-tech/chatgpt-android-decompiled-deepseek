package p341Ni;

import android.content.IntentFilter;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Handler;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17314q;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p148Fi.C2761E0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p913o2.AbstractC17803d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C5747D extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f18702Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f18703Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5784h0 f18704o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5747D(C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18704o0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5747D c5747d = new C5747D(this.f18704o0, interfaceC18770c);
        c5747d.f18703Z = obj;
        return c5747d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5747D) create((InterfaceC5798r) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        PlaybackState playbackStateBuild;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f18702Y;
        C17296C c17296c = C17296C.f55119a;
        C5784h0 c5784h0 = this.f18704o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC5798r interfaceC5798r = (InterfaceC5798r) this.f18703Z;
            MediaSession mediaSession = c5784h0.f18848V;
            boolean zM18089b = interfaceC5798r instanceof C5791l ? true : AbstractC16544l.m18089b(interfaceC5798r, C5797q.f18932a);
            C5793m c5793m = C5793m.f18928a;
            if (zM18089b) {
                playbackStateBuild = new PlaybackState.Builder().setState(8, 0L, 0.0f).build();
                AbstractC16544l.m18093f(playbackStateBuild, "build(...)");
            } else if (interfaceC5798r instanceof C5789k) {
                playbackStateBuild = new PlaybackState.Builder().setState(3, 0L, 1.0f).build();
                AbstractC16544l.m18093f(playbackStateBuild, "build(...)");
            } else {
                if (interfaceC5798r instanceof C5796p ? true : AbstractC16544l.m18089b(interfaceC5798r, c5793m) ? true : AbstractC16544l.m18089b(interfaceC5798r, C5794n.f18929a)) {
                    playbackStateBuild = new PlaybackState.Builder().setState(1, 0L, 0.0f).build();
                    AbstractC16544l.m18093f(playbackStateBuild, "build(...)");
                } else {
                    if (!(interfaceC5798r instanceof C5795o)) {
                        throw new C0644w();
                    }
                    playbackStateBuild = new PlaybackState.Builder().setState(7, 0L, 0.0f).build();
                    AbstractC16544l.m18093f(playbackStateBuild, "build(...)");
                }
            }
            mediaSession.setPlaybackState(playbackStateBuild);
            if (interfaceC5798r instanceof C5789k) {
                AbstractC8160o6.m8726a(c5784h0.f18872x, "Starting voice mode foreground service", null, 6);
                C2761E0 c2761e0 = c5784h0.f18852d;
                c2761e0.f8463e = true;
                AbstractC17803d.m19558e(c2761e0.f8459a, c2761e0, new IntentFilter("End"));
            } else {
                boolean zM18089b2 = AbstractC16544l.m18089b(interfaceC5798r, c5793m);
                C17314q c17314q = c5784h0.f18873y;
                if (zM18089b2) {
                    C5788j0 c5788j0 = (C5788j0) c5784h0.f18862n.getValue();
                    boolean z6 = false;
                    if (c5788j0 != null) {
                        if (c5788j0.f18903g != null) {
                            z6 = true;
                        }
                    }
                    if (z6) {
                        C5785i c5785i = (C5785i) c17314q.getValue();
                        c5785i.getClass();
                        AbstractC0575H.m1156D(c5785i.f18875a, null, null, new C5779f(c5785i, R.raw.hangup_0db, null), 3);
                        C5785i c5785i2 = (C5785i) c17314q.getValue();
                        this.f18702Y = 1;
                        Object objM6187a = c5785i2.m6187a(4, this);
                        if (objM6187a != enumC19250a) {
                            objM6187a = c17296c;
                        }
                        if (objM6187a == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } else if (interfaceC5798r instanceof C5795o) {
                    C5785i c5785i3 = (C5785i) c17314q.getValue();
                    c5785i3.getClass();
                    AbstractC0575H.m1156D(c5785i3.f18875a, null, null, new C5779f(c5785i3, R.raw.error_0db, null), 3);
                }
            }
            return c17296c;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        C5801u c5801u = c5784h0.f18870v;
        Handler handler = c5801u.f18943h;
        handler.removeCallbacksAndMessages(null);
        handler.postAtFrontOfQueue(new RunnableC5799s(c5801u, 1));
        c5784h0.m6186t();
        return c17296c;
    }
}
