package com.openai.feature.messages.impl.audio;

import android.net.Uri;
import androidx.work.impl.utils.p651oZ.HhJS;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.C2059h;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p991rh.C19003l;
import p996rm.EnumC19250a;
import pf.C18398n;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$playAudioAssetPointer$2", m20656f = "MessageAudioViewModelImpl.kt", m20657l = {217, 232}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageAudioViewModelImpl$playAudioAssetPointer$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38684Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessageAudioViewModelImpl f38685Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7351f0 f38686o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f38687p0;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$playAudioAssetPointer$2$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lpf/n;", "invoke", "(Lpf/n;)Lpf/n;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123991 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ String f38688Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123991(String str) {
            super(1);
            this.f38688Y = str;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C18398n setState = (C18398n) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C18398n.m19867e(setState, true, null, 0L, false, true, this.f38688Y, false, false, AbstractC16544l.m18089b(setState.f58691f, this.f38688Y) ? setState.f58696k : C18398n.f58685l, 838);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$playAudioAssetPointer$2$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lpf/n;", "invoke", "(Lpf/n;)Lpf/n;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124002 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C124002 f38689Y = new C124002();

        public C124002() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C18398n setState = (C18398n) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C18398n.m19867e(setState, false, null, 0L, true, false, null, false, false, null, 2023);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$playAudioAssetPointer$2$3 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lpf/n;", "invoke", "(Lpf/n;)Lpf/n;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124013 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C124013 f38690Y = new C124013();

        public C124013() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C18398n setState = (C18398n) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C18398n.m19867e(setState, false, null, 0L, true, false, null, false, false, null, 2023);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAudioViewModelImpl$playAudioAssetPointer$2(MessageAudioViewModelImpl messageAudioViewModelImpl, C7351f0 c7351f0, String str, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38685Z = messageAudioViewModelImpl;
        this.f38686o0 = c7351f0;
        this.f38687p0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MessageAudioViewModelImpl$playAudioAssetPointer$2(this.f38685Z, this.f38686o0, this.f38687p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MessageAudioViewModelImpl$playAudioAssetPointer$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38684Y;
        C17296C c17296c = C17296C.f55119a;
        MessageAudioViewModelImpl messageAudioViewModelImpl = this.f38685Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        String str = this.f38687p0;
        C123991 c123991 = new C123991(str);
        int i11 = MessageAudioViewModelImpl.f38657s;
        messageAudioViewModelImpl.m14397m(c123991);
        String str2 = this.f38686o0.f23288c;
        if (str2 == null) {
            return c17296c;
        }
        this.f38684Y = 1;
        obj = messageAudioViewModelImpl.f38663n.m7791a(str, str2, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) obj;
        if (!AbstractC16544l.m18089b(abstractC6224C, C6248v.f20327a)) {
            boolean z6 = abstractC6224C instanceof AbstractC6249w;
            String str3 = HhJS.UAaLjkiouPjc;
            if (z6) {
                C124002 c124002 = C124002.f38689Y;
                int i12 = MessageAudioViewModelImpl.f38657s;
                messageAudioViewModelImpl.m14397m(c124002);
                String message = ((AbstractC6249w) abstractC6224C).f20328a.getMessage();
                if (message != null) {
                    str3 = message;
                }
                messageAudioViewModelImpl.m14393h(new C2059h(str3));
            } else if (abstractC6224C instanceof C6223B) {
                C6223B c6223b = (C6223B) abstractC6224C;
                String str4 = ((C19003l) c6223b.f20258a).f60582b;
                if (str4 == null) {
                    C124013 c124013 = C124013.f38690Y;
                    int i13 = MessageAudioViewModelImpl.f38657s;
                    messageAudioViewModelImpl.m14397m(c124013);
                    String str5 = ((C19003l) c6223b.f20258a).f60584d;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    messageAudioViewModelImpl.m14393h(new C2059h(str3));
                    return c17296c;
                }
                Uri uri = Uri.parse(str4);
                AbstractC16544l.m18093f(uri, "parse(...)");
                this.f38684Y = 2;
                int i14 = MessageAudioViewModelImpl.f38657s;
                if (messageAudioViewModelImpl.m14310o(uri, true, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        }
        return c17296c;
    }
}
