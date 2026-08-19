package com.openai.feature.messages.impl.image;

import android.net.Uri;
import gd.C13937f2;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.C2059h;
import p103Dn.AbstractC2124C;
import p1081wc.C20886e;
import p1155zi.AbstractC21933K1;
import p129En.C2604o;
import p403Qd.C6636i;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p926of.C18173j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import tf.C19906K;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$4", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {151, 152, 155}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ImageDetailViewModelImpl$onIntent$4 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38771Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ImageDetailViewModelImpl f38772Z;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$4$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Ltf/K;", "invoke", "(Ltf/K;)Ltf/K;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124131 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C124131 f38773Y = new C124131();

        public C124131() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C19906K setState = (C19906K) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C19906K.m20796e(setState, null, 0, 0, false, false, true, null, false, false, null, false, null, false, 65503);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$4$3 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$4$3", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Landroid/net/Uri;", "it", "Lmm/C;", "<anonymous>", "(Landroid/net/Uri;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124143 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38774Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ ImageDetailViewModelImpl f38775Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124143(ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f38775Z = imageDetailViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124143 c124143 = new C124143(this.f38775Z, interfaceC18770c);
            c124143.f38774Y = obj;
            return c124143;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124143 c124143 = (C124143) create((Uri) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124143.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            ImageDetailViewModelImpl.m14315q(this.f38775Z, (Uri) this.f38774Y);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$4$4 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$4$4", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/K1;", "it", "Lmm/C;", "<anonymous>", "(Lzi/K1;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124154 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38776Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ ImageDetailViewModelImpl f38777Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124154(ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f38777Z = imageDetailViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124154 c124154 = new C124154(this.f38777Z, interfaceC18770c);
            c124154.f38776Y = obj;
            return c124154;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124154 c124154 = (C124154) create((AbstractC21933K1) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124154.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            this.f38777Z.m14393h(new C2059h((AbstractC21933K1) this.f38776Y));
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetailViewModelImpl$onIntent$4(ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38772Z = imageDetailViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ImageDetailViewModelImpl$onIntent$4(this.f38772Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ImageDetailViewModelImpl$onIntent$4) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C6636i c6636i;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38771Y;
        C17296C c17296c = C17296C.f55119a;
        ImageDetailViewModelImpl imageDetailViewModelImpl = this.f38772Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18173j c18173j = ((C19906K) imageDetailViewModelImpl.m14391f()).f63092q;
            if (c18173j == null) {
                return c17296c;
            }
            imageDetailViewModelImpl.f38732o.m4413a(C20886e.f66523k, c18173j, C17690x.f56481Y);
            if (c18173j.f57977j) {
                if (((Boolean) imageDetailViewModelImpl.f38734q.m15479a(C13937f2.f43987d)).booleanValue()) {
                    imageDetailViewModelImpl.m14397m(C124131.f38773Y);
                    C2604o c2604o = imageDetailViewModelImpl.f38735r.f45521t;
                    this.f38771Y = 1;
                    obj = AbstractC2124C.m3221t(c2604o, this);
                    if (obj == enumC19250a) {
                        return enumC19250a;
                    }
                    c6636i = (C6636i) obj;
                    if (c6636i != null) {
                        this.f38771Y = 2;
                        if (ImageDetailViewModelImpl.m14313o(imageDetailViewModelImpl, c6636i, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
            }
            C124143 c124143 = new C124143(imageDetailViewModelImpl, null);
            C124154 c124154 = new C124154(imageDetailViewModelImpl, null);
            this.f38771Y = 3;
            if (imageDetailViewModelImpl.f38728k.m21015b(c18173j.f57968a, c124143, c124154, this) == enumC19250a) {
                return enumC19250a;
            }
        } else if (i10 == 1) {
            AbstractC9233X.m9807c(obj);
            c6636i = (C6636i) obj;
            if (c6636i != null) {
                this.f38771Y = 2;
                if (ImageDetailViewModelImpl.m14313o(imageDetailViewModelImpl, c6636i, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
