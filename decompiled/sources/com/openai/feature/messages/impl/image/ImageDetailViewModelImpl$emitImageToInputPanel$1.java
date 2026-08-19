package com.openai.feature.messages.impl.image;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1025te.C19863N;
import p1025te.C19864O;
import p1025te.C19867S;
import p1025te.C19874e;
import p1025te.C19876g;
import p1155zi.C21907E;
import p1155zi.C22071w0;
import p1155zi.EnumC21968V0;
import p160G5.p161rK.TVCuK;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17660E;
import p926of.C18173j;
import p972qm.InterfaceC18770c;
import p991rh.EnumC18991F;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$emitImageToInputPanel$1", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ImageDetailViewModelImpl$emitImageToInputPanel$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C18173j f38753Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ImageDetailViewModelImpl f38754Z;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$emitImageToInputPanel$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124111 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ Uri f38755Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ C19874e f38756Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124111(Uri uri, C19874e c19874e) {
            super(1);
            this.f38755Y = uri;
            this.f38756Z = c19874e;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C19863N update = (C19863N) obj;
            AbstractC16544l.m18094g(update, "$this$update");
            return C19863N.m20780a(update, null, false, AbstractC17660E.m19258c(new C17309l(this.f38755Y, this.f38756Z)), null, false, null, null, null, 251);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$emitImageToInputPanel$1$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124122 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ Uri f38757Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ C19874e f38758Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124122(Uri uri, C19874e c19874e) {
            super(1);
            this.f38757Y = uri;
            this.f38758Z = c19874e;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C19863N c19863n = (C19863N) obj;
            AbstractC16544l.m18094g(c19863n, TVCuK.aJzpDrfsTEymfVc);
            return C19863N.m20780a(c19863n, null, false, null, null, false, new C19867S(this.f38757Y, this.f38758Z), null, null, 223);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetailViewModelImpl$emitImageToInputPanel$1(C18173j c18173j, ImageDetailViewModelImpl imageDetailViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38753Y = c18173j;
        this.f38754Z = imageDetailViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ImageDetailViewModelImpl$emitImageToInputPanel$1(this.f38753Y, this.f38754Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ImageDetailViewModelImpl$emitImageToInputPanel$1 imageDetailViewModelImpl$emitImageToInputPanel$1 = (ImageDetailViewModelImpl$emitImageToInputPanel$1) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        imageDetailViewModelImpl$emitImageToInputPanel$1.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C18173j c18173j = this.f38753Y;
        Uri uri = Uri.parse(C21907E.m22337a(c18173j.f57968a));
        AbstractC16544l.m18093f(uri, "parse(...)");
        EnumC21968V0 enumC21968V0 = EnumC21968V0.Transformation;
        C19874e c19874e = new C19874e(EnumC18991F.f60566p0, enumC21968V0, new C19876g(new C22071w0(enumC21968V0, c18173j.f57968a, (String) null, c18173j.f57969b, c18173j.f57970c, (String) null, c18173j.f57972e, c18173j.f57971d, 36)));
        ImageDetailViewModelImpl imageDetailViewModelImpl = this.f38754Z;
        boolean zM14316a = ImageDetailViewModelImplKt.m14316a(c18173j.f57969b, ((C19863N) imageDetailViewModelImpl.f38726i.f62964c.getValue()).f62956c);
        C19864O c19864o = imageDetailViewModelImpl.f38726i;
        if (((C19863N) c19864o.f62964c.getValue()).f62956c.isEmpty() || zM14316a) {
            c19864o.m20781a(new C124111(uri, c19874e));
        } else {
            c19864o.m20781a(new C124122(uri, c19874e));
        }
        return C17296C.f55119a;
    }
}
