package com.openai.feature.messages.impl.image;

import android.net.Uri;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.C2059h;
import p1081wc.C20886e;
import p1155zi.AbstractC21933K1;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p926of.C18173j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import tf.C19906K;
import tf.C19924i;
import tf.InterfaceC19938w;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$6", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {168, 170}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ImageDetailViewModelImpl$onIntent$6 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38780Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ImageDetailViewModelImpl f38781Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC19938w f38782o0;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$6$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$6$1", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Landroid/net/Uri;", "it", "Lmm/C;", "<anonymous>", "(Landroid/net/Uri;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124161 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38783Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ ImageDetailViewModelImpl f38784Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124161(ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f38784Z = imageDetailViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124161 c124161 = new C124161(this.f38784Z, interfaceC18770c);
            c124161.f38783Y = obj;
            return c124161;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124161 c124161 = (C124161) create((Uri) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124161.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            ImageDetailViewModelImpl.m14315q(this.f38784Z, (Uri) this.f38783Y);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$6$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$onIntent$6$2", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/K1;", "it", "Lmm/C;", "<anonymous>", "(Lzi/K1;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124172 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38785Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ ImageDetailViewModelImpl f38786Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124172(ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f38786Z = imageDetailViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124172 c124172 = new C124172(this.f38786Z, interfaceC18770c);
            c124172.f38785Y = obj;
            return c124172;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124172 c124172 = (C124172) create((AbstractC21933K1) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124172.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            this.f38786Z.m14393h(new C2059h((AbstractC21933K1) this.f38785Y));
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetailViewModelImpl$onIntent$6(ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC19938w interfaceC19938w, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38781Z = imageDetailViewModelImpl;
        this.f38782o0 = interfaceC19938w;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ImageDetailViewModelImpl$onIntent$6(this.f38781Z, this.f38782o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ImageDetailViewModelImpl$onIntent$6) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38780Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ImageDetailViewModelImpl imageDetailViewModelImpl = this.f38781Z;
            C18173j c18173j = ((C19906K) imageDetailViewModelImpl.m14391f()).f63092q;
            if (c18173j == null) {
                return c17296c;
            }
            imageDetailViewModelImpl.f38732o.m4413a(C20886e.f66520h, c18173j, C17690x.f56481Y);
            if (((C19924i) this.f38782o0).f63181a) {
                this.f38780Y = 1;
                if (ImageDetailViewModelImpl.m14314p(imageDetailViewModelImpl, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C124161 c124161 = new C124161(imageDetailViewModelImpl, null);
                C124172 c124172 = new C124172(imageDetailViewModelImpl, null);
                this.f38780Y = 2;
                if (imageDetailViewModelImpl.f38728k.m21015b(c18173j.f57968a, c124161, c124172, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
