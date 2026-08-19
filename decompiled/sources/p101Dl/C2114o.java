package p101Dl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9233X;
import p867l8.C16831c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dl.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C2114o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6471Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2117r f6472Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2114o(C2117r c2117r, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6472Z = c2117r;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2114o c2114o = new C2114o(this.f6472Z, interfaceC18770c);
        c2114o.f6471Y = obj;
        return c2114o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C2114o c2114o = (C2114o) create((C17309l) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c2114o.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C17309l c17309l = (C17309l) this.f6471Y;
        boolean zBooleanValue = ((Boolean) c17309l.f55136Y).booleanValue();
        boolean zBooleanValue2 = ((Boolean) c17309l.f55137Z).booleanValue();
        C2117r c2117r = this.f6472Z;
        c2117r.getClass();
        if (!zBooleanValue || !zBooleanValue2) {
            c2117r.m3186c();
        } else if (c2117r.f6479e.compareAndSet(false, true)) {
            AudioTrack audioTrack = c2117r.f6478d;
            if (audioTrack == null) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(320);
                AudioTrack audioTrackBuild = new AudioTrack.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(16000).setChannelMask(4).build()).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setBufferSizeInBytes(byteBufferAllocateDirect.capacity()).setTransferMode(0).setSessionId(0).build();
                AbstractC16544l.m18093f(audioTrackBuild, "build(...)");
                audioTrackBuild.write(byteBufferAllocateDirect, byteBufferAllocateDirect.remaining(), 0);
                audioTrackBuild.setLoopPoints(0, 159, -1);
                c2117r.f6478d = audioTrackBuild;
                audioTrack = audioTrackBuild;
            }
            synchronized (audioTrack) {
                try {
                    if (audioTrack.getState() == 1) {
                        audioTrack.play();
                    } else {
                        C8395g c8395g = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i = EnumC8397i.f26118o0;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18569g(new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return C17296C.f55119a;
    }
}
