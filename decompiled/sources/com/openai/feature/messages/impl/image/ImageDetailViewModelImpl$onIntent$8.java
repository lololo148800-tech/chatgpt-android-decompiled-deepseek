package com.openai.feature.messages.impl.image;

import com.openai.chatgpt.R;
import gd.C13919b0;
import gd.C14005w2;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.C2059h;
import p098Di.C2060i;
import p1081wc.C20886e;
import p1155zi.AbstractC21933K1;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p926of.C18173j;
import p972qm.InterfaceC18770c;
import p991rh.AbstractC19000i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import tf.C19906K;
import tf.C19922g;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$8", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {182}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ImageDetailViewModelImpl$onIntent$8 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38788Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ImageDetailViewModelImpl f38789Z;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$8$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$8$1", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124181 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ ImageDetailViewModelImpl f38790Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124181(ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
            this.f38790Y = imageDetailViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return new C124181(this.f38790Y, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C124181 c124181 = (C124181) create((InterfaceC18770c) obj);
            C17296C c17296c = C17296C.f55119a;
            c124181.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            this.f38790Y.m14393h(new C2060i(R.string.conversations_image_download_success));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$8$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$8$2", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/K1;", "it", "Lmm/C;", "<anonymous>", "(Lzi/K1;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124192 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38791Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ ImageDetailViewModelImpl f38792Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124192(ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f38792Z = imageDetailViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124192 c124192 = new C124192(this.f38792Z, interfaceC18770c);
            c124192.f38791Y = obj;
            return c124192;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124192 c124192 = (C124192) create((AbstractC21933K1) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124192.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            this.f38792Z.m14393h(new C2059h((AbstractC21933K1) this.f38791Y));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$8$3 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$8$3", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LOh/w;", "it", "Lmm/C;", "<anonymous>", "(LOh/w;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124203 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38793Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ ImageDetailViewModelImpl f38794Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124203(ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f38794Z = imageDetailViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124203 c124203 = new C124203(this.f38794Z, interfaceC18770c);
            c124203.f38793Y = obj;
            return c124203;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124203 c124203 = (C124203) create((AbstractC6249w) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124203.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            AbstractC6249w abstractC6249w = (AbstractC6249w) this.f38793Y;
            ImageDetailViewModelImpl imageDetailViewModelImpl = this.f38794Z;
            imageDetailViewModelImpl.getClass();
            Throwable th2 = abstractC6249w.f20328a;
            if (th2 instanceof AbstractC19000i) {
                imageDetailViewModelImpl.m14392g(new C19922g((AbstractC19000i) th2));
            } else {
                imageDetailViewModelImpl.m14393h(new C2059h(AbstractC6224C.m6734a(abstractC6249w)));
            }
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetailViewModelImpl$onIntent$8(ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38789Z = imageDetailViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ImageDetailViewModelImpl$onIntent$8(this.f38789Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ImageDetailViewModelImpl$onIntent$8) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38788Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ImageDetailViewModelImpl imageDetailViewModelImpl = this.f38789Z;
            C18173j c18173j = ((C19906K) imageDetailViewModelImpl.m14391f()).f63092q;
            if (c18173j == null) {
                return c17296c;
            }
            imageDetailViewModelImpl.f38732o.m4413a(C20886e.f66521i, c18173j, C17690x.f56481Y);
            boolean zM15481a = ((C14005w2) imageDetailViewModelImpl.f38729l).m15481a(C13919b0.f43970c);
            C124181 c124181 = new C124181(imageDetailViewModelImpl, null);
            C124192 c124192 = new C124192(imageDetailViewModelImpl, null);
            C124203 c124203 = new C124203(imageDetailViewModelImpl, null);
            this.f38788Y = 1;
            if (imageDetailViewModelImpl.f38728k.m21014a(c18173j.f57968a, zM15481a, c124181, c124192, c124203, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
