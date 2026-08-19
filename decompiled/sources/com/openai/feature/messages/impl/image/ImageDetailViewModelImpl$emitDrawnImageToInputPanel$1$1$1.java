package com.openai.feature.messages.impl.image;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1025te.C19863N;
import p1025te.C19864O;
import p1025te.C19868T;
import p1025te.C19872c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import tf.C19906K;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ImageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ImageDetailViewModelImpl f38747Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f38748Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Uri f38749o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Uri f38750p0;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124091 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C19872c f38751Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124091(C19872c c19872c) {
            super(1);
            this.f38751Y = c19872c;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C19863N update = (C19863N) obj;
            AbstractC16544l.m18094g(update, "$this$update");
            return C19863N.m20780a(update, null, false, null, null, true, null, this.f38751Y, null, 175);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124102 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C19872c f38752Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124102(C19872c c19872c) {
            super(1);
            this.f38752Y = c19872c;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C19863N update = (C19863N) obj;
            AbstractC16544l.m18094g(update, "$this$update");
            return C19863N.m20780a(update, null, false, null, null, false, new C19868T(this.f38752Y), null, null, 223);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1(ImageDetailViewModelImpl imageDetailViewModelImpl, String str, Uri uri, Uri uri2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f38747Y = imageDetailViewModelImpl;
        this.f38748Z = str;
        this.f38749o0 = uri;
        this.f38750p0 = uri2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new ImageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1(this.f38747Y, this.f38748Z, this.f38749o0, this.f38750p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ImageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1 imageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1 = (ImageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        imageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ImageDetailViewModelImpl imageDetailViewModelImpl = this.f38747Y;
        String value = ((C19906K) imageDetailViewModelImpl.m14391f()).f63094s;
        AbstractC16544l.m18094g(value, "value");
        Uri uri = this.f38750p0;
        Uri uri2 = this.f38749o0;
        String str = this.f38748Z;
        C19872c c19872c = new C19872c(str, value, uri2, uri);
        C19864O c19864o = imageDetailViewModelImpl.f38726i;
        boolean zM14316a = ImageDetailViewModelImplKt.m14316a(str, ((C19863N) c19864o.f62964c.getValue()).f62956c);
        if (((C19863N) c19864o.f62964c.getValue()).f62956c.isEmpty() || zM14316a) {
            c19864o.m20781a(new C124091(c19872c));
        } else {
            c19864o.m20781a(new C124102(c19872c));
        }
        return C17296C.f55119a;
    }
}
