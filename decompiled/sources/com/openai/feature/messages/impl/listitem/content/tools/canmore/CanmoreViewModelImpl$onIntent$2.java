package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import android.content.ContentResolver;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1113xn.C21307a;
import p193Hf.C3361f;
import p193Hf.InterfaceC3364g;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p523V9.AbstractC7942M5;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$onIntent$2", m20656f = "CanmoreViewModel.kt", m20657l = {225}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CanmoreViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38912Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CanmoreViewModelImpl f38913Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3364g f38914o0;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$onIntent$2$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$onIntent$2$1", m20656f = "CanmoreViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124361 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ CanmoreViewModelImpl f38915Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ InterfaceC3364g f38916Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124361(CanmoreViewModelImpl canmoreViewModelImpl, InterfaceC3364g interfaceC3364g, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f38915Y = canmoreViewModelImpl;
            this.f38916Z = interfaceC3364g;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return new C124361(this.f38915Y, this.f38916Z, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
            C124361 c124361 = (C124361) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124361.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) throws FileNotFoundException {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            ContentResolver contentResolver = this.f38915Y.f38865i.getContentResolver();
            InterfaceC3364g interfaceC3364g = this.f38916Z;
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(((C3361f) interfaceC3364g).f10267b);
            if (outputStreamOpenOutputStream != null) {
                try {
                    byte[] bytes = ((C3361f) interfaceC3364g).f10266a.getBytes(C21307a.f67720a);
                    AbstractC16544l.m18093f(bytes, "getBytes(...)");
                    outputStreamOpenOutputStream.write(bytes);
                    AbstractC7942M5.m8232a(outputStreamOpenOutputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(outputStreamOpenOutputStream, th2);
                        throw th3;
                    }
                }
            }
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanmoreViewModelImpl$onIntent$2(CanmoreViewModelImpl canmoreViewModelImpl, InterfaceC3364g interfaceC3364g, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38913Z = canmoreViewModelImpl;
        this.f38914o0 = interfaceC3364g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new CanmoreViewModelImpl$onIntent$2(this.f38913Z, this.f38914o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((CanmoreViewModelImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38912Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            CanmoreViewModelImpl canmoreViewModelImpl = this.f38913Z;
            canmoreViewModelImpl.f38866j.getClass();
            C3516e c3516e = AbstractC0593T.f1824a;
            ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
            C124361 c124361 = new C124361(canmoreViewModelImpl, this.f38914o0, null);
            this.f38912Y = 1;
            if (AbstractC0575H.m1168P(executorC3515d, c124361, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
