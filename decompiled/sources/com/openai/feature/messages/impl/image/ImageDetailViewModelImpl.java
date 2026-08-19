package com.openai.feature.messages.impl.image;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bf.AbstractC11372a0;
import com.openai.chatgpt.R;
import com.openai.feature.messages.image.ImageDetailViewModel;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13841B0;
import gd.C13844C0;
import gd.C13993t2;
import gd.C14005w2;
import gd.InterfaceC13849E;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p072Ci.EnumC1702g;
import p086D6.C1970n;
import p092Dc.C1991h;
import p093Dd.C2017i;
import p098Di.C2055d;
import p098Di.C2056e;
import p098Di.C2059h;
import p098Di.C2060i;
import p098Di.InterfaceC2053b;
import p1025te.C19864O;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2207t0;
import p103Dn.C2217y0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1041uf.C20217f;
import p1042uh.C20263a0;
import p1081wc.C20855A;
import p1081wc.C20886e;
import p1081wc.InterfaceC20904w;
import p1082wd.C20908a;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p216Id.C3694b;
import p218If.C3710a;
import p338Ne.C5718f;
import p403Qd.C6636i;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p708dh.C13141T;
import p749fd.EnumC13617b;
import p787he.C14459O;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.C17690x;
import p926of.C18173j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import tf.C19906K;
import tf.C19909N;
import tf.C19911P;
import tf.C19921f;
import tf.C19924i;
import tf.C19925j;
import tf.C19926k;
import tf.C19927l;
import tf.C19928m;
import tf.C19929n;
import tf.C19930o;
import tf.C19931p;
import tf.C19932q;
import tf.C19933r;
import tf.C19934s;
import tf.C19935t;
import tf.C19936u;
import tf.C19937v;
import tf.InterfaceC19938w;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/messages/impl/image/ImageDetailViewModelImpl;", "Lcom/openai/feature/messages/image/ImageDetailViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ImageDetailViewModelImpl extends ImageDetailViewModel {

    /* JADX INFO: renamed from: i */
    public final C19864O f38726i;

    /* JADX INFO: renamed from: j */
    public final C19909N f38727j;

    /* JADX INFO: renamed from: k */
    public final C20217f f38728k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC13849E f38729l;

    /* JADX INFO: renamed from: m */
    public final C1991h f38730m;

    /* JADX INFO: renamed from: n */
    public final C13141T f38731n;

    /* JADX INFO: renamed from: o */
    public final C3710a f38732o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC20904w f38733p;

    /* JADX INFO: renamed from: q */
    public final C13993t2 f38734q;

    /* JADX INFO: renamed from: r */
    public final C14459O f38735r;

    /* JADX INFO: renamed from: s */
    public final C5718f f38736s;

    /* JADX INFO: renamed from: t */
    public final C3430e f38737t;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$1", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124061 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Ltf/K;", "", "show", "invoke", "(Ltf/K;Z)Ltf/K;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f38739Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(2);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                C19906K setOnEach = (C19906K) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
                return C19906K.m20796e(setOnEach, null, 0, 0, zBooleanValue, false, false, null, false, false, null, false, null, false, 65527);
            }
        }

        public C124061(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return ImageDetailViewModelImpl.this.new C124061(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C124061 c124061 = (C124061) create((InterfaceC18770c) obj);
            C17296C c17296c = C17296C.f55119a;
            c124061.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            ImageDetailViewModelImpl imageDetailViewModelImpl = ImageDetailViewModelImpl.this;
            if (((C19906K) imageDetailViewModelImpl.m14391f()).f63085j) {
                imageDetailViewModelImpl.m14396l(AnonymousClass1.f38739Y, new C1970n(imageDetailViewModelImpl.f38731n.f41721d, 21, EnumC1702g.DalleOperatioOnboarding));
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Ltf/K;", "Ltf/P;", "imageSelection", "invoke", "(Ltf/K;Ltf/P;)Ltf/K;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124072 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124072 f38740Y = new C124072();

        public C124072() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C19906K setOnEach = (C19906K) obj;
            C19911P imageSelection = (C19911P) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(imageSelection, "imageSelection");
            return C19906K.m20796e(setOnEach, imageSelection.f63109a, imageSelection.f63110b, 0, false, false, false, imageSelection.f63111c ? EnumC13617b.f43009Z : setOnEach.f63082g, imageSelection.f63112d, imageSelection.f63113e, null, false, null, false, 65084);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$4 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$4", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lof/j;", "it", "Lmm/C;", "<anonymous>", "(Lof/j;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124084 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38741Y;

        public C124084(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124084 c124084 = ImageDetailViewModelImpl.this.new C124084(interfaceC18770c);
            c124084.f38741Y = obj;
            return c124084;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124084 c124084 = (C124084) create((C18173j) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124084.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            ImageDetailViewModelImpl.this.f38732o.m4413a(C20886e.f66524l, (C18173j) this.f38741Y, C17690x.f56481Y);
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageDetailViewModelImpl(C19864O c19864o, C19909N c19909n, C20217f c20217f, InterfaceC13849E interfaceC13849E, C1991h c1991h, C13141T c13141t, C3710a c3710a, InterfaceC20904w interfaceC20904w, C13993t2 c13993t2, C14459O c14459o, C5718f c5718f, C16382j c16382j) {
        C14005w2 c14005w2 = (C14005w2) interfaceC13849E;
        boolean zM15481a = c14005w2.m15481a(C13844C0.f43880c);
        C2217y0 c2217y0 = c19909n.f63107b;
        boolean z6 = zM15481a && ((C19911P) c2217y0.f6797Y.getValue()).f63112d;
        boolean zM15481a2 = c14005w2.m15481a(C13841B0.f43877c);
        C20263a0 c20263a0 = ((C20908a) c16382j.f50876c.getValue()).f66645a;
        super(new C19906K(null, 0, 0, false, false, false, EnumC13617b.f43011p0, true, true, z6, zM15481a2, c20263a0 != null ? AbstractC11372a0.m12782a(c20263a0) : null, null, false, null, false));
        this.f38726i = c19864o;
        this.f38727j = c19909n;
        this.f38728k = c20217f;
        this.f38729l = interfaceC13849E;
        this.f38730m = c1991h;
        this.f38731n = c13141t;
        this.f38732o = c3710a;
        this.f38733p = interfaceC20904w;
        this.f38734q = c13993t2;
        this.f38735r = c14459o;
        this.f38736s = c5718f;
        this.f38737t = AbstractC8168p6.m8749b("ImageDetailViewModel", null);
        m14394i(new C124061(null));
        m14396l(C124072.f38740Y, c2217y0);
        final C2153Q0 c2153q0 = this.f40343c;
        AbstractC2124C.m3226y(new C1970n(AbstractC2124C.m3215n(new InterfaceC2184i() { // from class: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$special$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$special$$inlined$mapNotNull$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C124212<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f38805Y;

                /* JADX INFO: renamed from: com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl$special$$inlined$mapNotNull$1$2", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {52}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f38806Y;

                    /* JADX INFO: renamed from: Z */
                    public int f38807Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f38806Y = obj;
                        this.f38807Z |= Integer.MIN_VALUE;
                        return C124212.this.mo395a(null, this);
                    }
                }

                public C124212(InterfaceC2186j interfaceC2186j) {
                    this.f38805Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f38807Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f38807Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f38806Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f38807Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        C18173j c18173j = ((C19906K) obj).f63092q;
                        if (c18173j != null) {
                            anonymousClass1.f38807Z = 1;
                            if (this.f38805Y.mo395a(c18173j, anonymousClass1) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj2);
                    }
                    return C17296C.f55119a;
                }
            }

            @Override // p103Dn.InterfaceC2184i
            /* JADX INFO: renamed from: d */
            public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
                c2153q0.mo3141d(new C124212(interfaceC2186j), interfaceC18770c);
                return EnumC19250a.f61036Y;
            }
        }), 5, new C124084(null)), ViewModelKt.m12143a(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14312n(ImageDetailViewModelImpl imageDetailViewModelImpl, AbstractC19687c abstractC19687c) {
        ImageDetailViewModelImpl$deleteShareLink$1 imageDetailViewModelImpl$deleteShareLink$1;
        imageDetailViewModelImpl.getClass();
        if (abstractC19687c instanceof ImageDetailViewModelImpl$deleteShareLink$1) {
            imageDetailViewModelImpl$deleteShareLink$1 = (ImageDetailViewModelImpl$deleteShareLink$1) abstractC19687c;
            int i10 = imageDetailViewModelImpl$deleteShareLink$1.f38746p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                imageDetailViewModelImpl$deleteShareLink$1.f38746p0 = i10 - Integer.MIN_VALUE;
            } else {
                imageDetailViewModelImpl$deleteShareLink$1 = new ImageDetailViewModelImpl$deleteShareLink$1(imageDetailViewModelImpl, abstractC19687c);
            }
        } else {
            imageDetailViewModelImpl$deleteShareLink$1 = new ImageDetailViewModelImpl$deleteShareLink$1(imageDetailViewModelImpl, abstractC19687c);
        }
        Object objM6153b = imageDetailViewModelImpl$deleteShareLink$1.f38744Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = imageDetailViewModelImpl$deleteShareLink$1.f38746p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM6153b);
            String str = ((C19906K) imageDetailViewModelImpl.m14391f()).f63090o;
            if (str != null) {
                imageDetailViewModelImpl$deleteShareLink$1.f38743Y = imageDetailViewModelImpl;
                imageDetailViewModelImpl$deleteShareLink$1.f38746p0 = 1;
                objM6153b = imageDetailViewModelImpl.f38736s.m6153b(str, imageDetailViewModelImpl$deleteShareLink$1);
                if (objM6153b == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        imageDetailViewModelImpl = imageDetailViewModelImpl$deleteShareLink$1.f38743Y;
        AbstractC9233X.m9807c(objM6153b);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM6153b;
        if (abstractC21955Q1 instanceof C21952P1) {
            imageDetailViewModelImpl.m14393h(C2056e.f6277a);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC8160o6.m8731f(imageDetailViewModelImpl.f38737t, "Failed to delete conversation", ((AbstractC21933K1) abstractC21955Q1).f69485a, null, 4);
            imageDetailViewModelImpl.m14393h(new C2059h(imageDetailViewModelImpl.f38730m.m3160b(R.string.image_share_modal_delete_link_error_text)));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14313o(ImageDetailViewModelImpl imageDetailViewModelImpl, C6636i c6636i, AbstractC19687c abstractC19687c) {
        ImageDetailViewModelImpl$makeShareLink$1 imageDetailViewModelImpl$makeShareLink$1;
        Object objM6156e;
        AbstractC21955Q1 abstractC21955Q1;
        String str;
        C18173j c18173j;
        Object objM6156e2;
        ImageDetailViewModelImpl imageDetailViewModelImpl2;
        AbstractC21955Q1 abstractC21955Q2;
        imageDetailViewModelImpl.getClass();
        if (abstractC19687c instanceof ImageDetailViewModelImpl$makeShareLink$1) {
            imageDetailViewModelImpl$makeShareLink$1 = (ImageDetailViewModelImpl$makeShareLink$1) abstractC19687c;
            int i10 = imageDetailViewModelImpl$makeShareLink$1.f38763q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                imageDetailViewModelImpl$makeShareLink$1.f38763q0 = i10 - Integer.MIN_VALUE;
            } else {
                imageDetailViewModelImpl$makeShareLink$1 = new ImageDetailViewModelImpl$makeShareLink$1(imageDetailViewModelImpl, abstractC19687c);
            }
        } else {
            imageDetailViewModelImpl$makeShareLink$1 = new ImageDetailViewModelImpl$makeShareLink$1(imageDetailViewModelImpl, abstractC19687c);
        }
        Object objM6152a = imageDetailViewModelImpl$makeShareLink$1.f38761o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = imageDetailViewModelImpl$makeShareLink$1.f38763q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM6152a);
            imageDetailViewModelImpl.m14397m(ImageDetailViewModelImpl$makeShareLink$2.f38764Y);
            String str2 = ((C19906K) imageDetailViewModelImpl.m14391f()).f63090o;
            C5718f c5718f = imageDetailViewModelImpl.f38736s;
            if (str2 != null) {
                imageDetailViewModelImpl$makeShareLink$1.f38763q0 = 1;
                C18173j c18173j2 = ((C19906K) imageDetailViewModelImpl.m14391f()).f63092q;
                if (c18173j2 == null) {
                    objM6156e = c17296c;
                } else {
                    objM6156e = c5718f.m6156e(str2, c18173j2.f57968a, imageDetailViewModelImpl$makeShareLink$1);
                    if (objM6156e != enumC19250a) {
                        objM6156e = c17296c;
                    }
                }
                if (objM6156e == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                String str3 = c6636i.f21379a;
                String str4 = c6636i.f21383e;
                if (str4 == null) {
                    str4 = null;
                }
                imageDetailViewModelImpl$makeShareLink$1.f38759Y = imageDetailViewModelImpl;
                imageDetailViewModelImpl$makeShareLink$1.f38763q0 = 2;
                objM6152a = c5718f.m6152a(str3, str4, imageDetailViewModelImpl$makeShareLink$1, true);
                if (objM6152a == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q1 = (AbstractC21955Q1) objM6152a;
                if (abstractC21955Q1 instanceof C21952P1) {
                    C2017i c2017i = (C2017i) ((C21952P1) abstractC21955Q1).f69511a;
                    imageDetailViewModelImpl.m14397m(new ImageDetailViewModelImpl$makeShareLink$3$1(c2017i));
                    str = c2017i.f6180a;
                    imageDetailViewModelImpl$makeShareLink$1.f38759Y = imageDetailViewModelImpl;
                    imageDetailViewModelImpl$makeShareLink$1.f38760Z = (C21952P1) abstractC21955Q1;
                    imageDetailViewModelImpl$makeShareLink$1.f38763q0 = 3;
                    c18173j = ((C19906K) imageDetailViewModelImpl.m14391f()).f63092q;
                    if (c18173j == null) {
                        objM6156e2 = c17296c;
                    } else {
                        objM6156e2 = imageDetailViewModelImpl.f38736s.m6156e(str, c18173j.f57968a, imageDetailViewModelImpl$makeShareLink$1);
                        if (objM6156e2 != enumC19250a) {
                            objM6156e2 = c17296c;
                        }
                    }
                    if (objM6156e2 == enumC19250a) {
                        return enumC19250a;
                    }
                    imageDetailViewModelImpl2 = imageDetailViewModelImpl;
                    abstractC21955Q2 = abstractC21955Q1;
                    ImageDetailViewModelImpl imageDetailViewModelImpl3 = imageDetailViewModelImpl2;
                    abstractC21955Q1 = abstractC21955Q2;
                    imageDetailViewModelImpl = imageDetailViewModelImpl3;
                }
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
                    AbstractC8160o6.m8731f(imageDetailViewModelImpl.f38737t, "Failed to create a share link", abstractC21933K1.f69485a, null, 4);
                    imageDetailViewModelImpl.m14393h(new C2059h(abstractC21933K1));
                }
                imageDetailViewModelImpl.m14397m(ImageDetailViewModelImpl$makeShareLink$5.f38766Y);
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                imageDetailViewModelImpl = imageDetailViewModelImpl$makeShareLink$1.f38759Y;
                AbstractC9233X.m9807c(objM6152a);
                abstractC21955Q1 = (AbstractC21955Q1) objM6152a;
                if (abstractC21955Q1 instanceof C21952P1) {
                    C2017i c2017i2 = (C2017i) ((C21952P1) abstractC21955Q1).f69511a;
                    imageDetailViewModelImpl.m14397m(new ImageDetailViewModelImpl$makeShareLink$3$1(c2017i2));
                    str = c2017i2.f6180a;
                    imageDetailViewModelImpl$makeShareLink$1.f38759Y = imageDetailViewModelImpl;
                    imageDetailViewModelImpl$makeShareLink$1.f38760Z = (C21952P1) abstractC21955Q1;
                    imageDetailViewModelImpl$makeShareLink$1.f38763q0 = 3;
                    c18173j = ((C19906K) imageDetailViewModelImpl.m14391f()).f63092q;
                    if (c18173j == null) {
                        objM6156e2 = c17296c;
                    } else {
                        objM6156e2 = imageDetailViewModelImpl.f38736s.m6156e(str, c18173j.f57968a, imageDetailViewModelImpl$makeShareLink$1);
                        if (objM6156e2 != enumC19250a) {
                            objM6156e2 = c17296c;
                        }
                    }
                    if (objM6156e2 == enumC19250a) {
                        return enumC19250a;
                    }
                    imageDetailViewModelImpl2 = imageDetailViewModelImpl;
                    abstractC21955Q2 = abstractC21955Q1;
                }
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    AbstractC21933K1 abstractC21933K2 = (AbstractC21933K1) abstractC21955Q1;
                    AbstractC8160o6.m8731f(imageDetailViewModelImpl.f38737t, "Failed to create a share link", abstractC21933K2.f69485a, null, 4);
                    imageDetailViewModelImpl.m14393h(new C2059h(abstractC21933K2));
                }
                imageDetailViewModelImpl.m14397m(ImageDetailViewModelImpl$makeShareLink$5.f38766Y);
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q2 = imageDetailViewModelImpl$makeShareLink$1.f38760Z;
                imageDetailViewModelImpl2 = imageDetailViewModelImpl$makeShareLink$1.f38759Y;
                AbstractC9233X.m9807c(objM6152a);
            }
            ImageDetailViewModelImpl imageDetailViewModelImpl4 = imageDetailViewModelImpl2;
            abstractC21955Q1 = abstractC21955Q2;
            imageDetailViewModelImpl = imageDetailViewModelImpl4;
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC21933K1 abstractC21933K3 = (AbstractC21933K1) abstractC21955Q1;
                AbstractC8160o6.m8731f(imageDetailViewModelImpl.f38737t, "Failed to create a share link", abstractC21933K3.f69485a, null, 4);
                imageDetailViewModelImpl.m14393h(new C2059h(abstractC21933K3));
            }
            imageDetailViewModelImpl.m14397m(ImageDetailViewModelImpl$makeShareLink$5.f38766Y);
        } else {
            AbstractC9233X.m9807c(objM6152a);
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:42:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: p */
    public static final Object m14314p(ImageDetailViewModelImpl imageDetailViewModelImpl, AbstractC19687c abstractC19687c) {
        ImageDetailViewModelImpl$publishAndShareConversation$1 imageDetailViewModelImpl$publishAndShareConversation$1;
        C19906K c19906k;
        C19906K c19906k2;
        ImageDetailViewModelImpl imageDetailViewModelImpl2;
        String str;
        AbstractC21955Q1 abstractC21955Q1;
        String str2;
        String str3;
        imageDetailViewModelImpl.getClass();
        if (abstractC19687c instanceof ImageDetailViewModelImpl$publishAndShareConversation$1) {
            imageDetailViewModelImpl$publishAndShareConversation$1 = (ImageDetailViewModelImpl$publishAndShareConversation$1) abstractC19687c;
            int i10 = imageDetailViewModelImpl$publishAndShareConversation$1.f38801r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                imageDetailViewModelImpl$publishAndShareConversation$1.f38801r0 = i10 - Integer.MIN_VALUE;
            } else {
                imageDetailViewModelImpl$publishAndShareConversation$1 = new ImageDetailViewModelImpl$publishAndShareConversation$1(imageDetailViewModelImpl, abstractC19687c);
            }
        } else {
            imageDetailViewModelImpl$publishAndShareConversation$1 = new ImageDetailViewModelImpl$publishAndShareConversation$1(imageDetailViewModelImpl, abstractC19687c);
        }
        Object obj = imageDetailViewModelImpl$publishAndShareConversation$1.f38799p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = imageDetailViewModelImpl$publishAndShareConversation$1.f38801r0;
        String str4 = VjclRfeKsMflo.Whpaz;
        if (i11 != 0) {
            if (i11 == 1) {
                C19906K c19906k3 = imageDetailViewModelImpl$publishAndShareConversation$1.f38797Z;
                ImageDetailViewModelImpl imageDetailViewModelImpl3 = imageDetailViewModelImpl$publishAndShareConversation$1.f38796Y;
                AbstractC9233X.m9807c(obj);
                c19906k = c19906k3;
                imageDetailViewModelImpl = imageDetailViewModelImpl3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = imageDetailViewModelImpl$publishAndShareConversation$1.f38798o0;
                c19906k2 = imageDetailViewModelImpl$publishAndShareConversation$1.f38797Z;
                imageDetailViewModelImpl2 = imageDetailViewModelImpl$publishAndShareConversation$1.f38796Y;
                AbstractC9233X.m9807c(obj);
            }
            abstractC21955Q1 = (AbstractC21955Q1) obj;
            if (abstractC21955Q1 instanceof C21952P1) {
                str2 = c19906k2.f63090o;
                if (str2 == null) {
                    str2 = str4;
                }
                str3 = c19906k2.f63088m;
                if (str3 == null) {
                    str3 = str4;
                }
                if (str != null) {
                    str4 = str;
                }
                imageDetailViewModelImpl2.getClass();
                imageDetailViewModelImpl2.f38733p.mo21447a(C20855A.f66297c, AbstractC17659D.m19244f(new C17309l("url", str3), new C17309l("share_id", str2), new C17309l("location", "dalle_share_sheet")));
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TITLE", str4);
                intent.putExtra("android.intent.extra.TEXT", str3);
                Intent intentCreateChooser = Intent.createChooser(intent, null);
                AbstractC16544l.m18091d(intentCreateChooser);
                imageDetailViewModelImpl2.m14393h(new C2055d(intentCreateChooser));
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
                AbstractC8160o6.m8731f(imageDetailViewModelImpl2.f38737t, "Failed to publish conversation", abstractC21933K1.f69485a, null, 4);
                imageDetailViewModelImpl2.m14393h(new C2059h(abstractC21933K1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            imageDetailViewModelImpl2.m14397m(ImageDetailViewModelImpl$publishAndShareConversation$5.f38803Y);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        imageDetailViewModelImpl.m14397m(ImageDetailViewModelImpl$publishAndShareConversation$2.f38802Y);
        C19906K c19906k4 = (C19906K) imageDetailViewModelImpl.m14391f();
        C2207t0 c2207t0 = imageDetailViewModelImpl.f38735r.f45526y;
        imageDetailViewModelImpl$publishAndShareConversation$1.f38796Y = imageDetailViewModelImpl;
        imageDetailViewModelImpl$publishAndShareConversation$1.f38797Z = c19906k4;
        imageDetailViewModelImpl$publishAndShareConversation$1.f38801r0 = 1;
        Object objM3221t = AbstractC2124C.m3221t(c2207t0, imageDetailViewModelImpl$publishAndShareConversation$1);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c19906k = c19906k4;
        obj = objM3221t;
        String str5 = ((C3694b) obj).f11223h;
        C5718f c5718f = imageDetailViewModelImpl.f38736s;
        String str6 = c19906k.f63090o;
        if (str6 == null) {
            str6 = str4;
        }
        imageDetailViewModelImpl$publishAndShareConversation$1.f38796Y = imageDetailViewModelImpl;
        imageDetailViewModelImpl$publishAndShareConversation$1.f38797Z = c19906k;
        imageDetailViewModelImpl$publishAndShareConversation$1.f38798o0 = str5;
        imageDetailViewModelImpl$publishAndShareConversation$1.f38801r0 = 2;
        Object objM6155d = c5718f.m6155d(str6, str5, imageDetailViewModelImpl$publishAndShareConversation$1, true);
        if (objM6155d == enumC19250a) {
            return enumC19250a;
        }
        c19906k2 = c19906k;
        imageDetailViewModelImpl2 = imageDetailViewModelImpl;
        str = str5;
        obj = objM6155d;
        abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof C21952P1) {
            str2 = c19906k2.f63090o;
            if (str2 == null) {
                str2 = str4;
            }
            str3 = c19906k2.f63088m;
            if (str3 == null) {
                str3 = str4;
            }
            if (str != null) {
                str4 = str;
            }
            imageDetailViewModelImpl2.getClass();
            imageDetailViewModelImpl2.f38733p.mo21447a(C20855A.f66297c, AbstractC17659D.m19244f(new C17309l("url", str3), new C17309l("share_id", str2), new C17309l("location", "dalle_share_sheet")));
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TITLE", str4);
            intent2.putExtra("android.intent.extra.TEXT", str3);
            Intent intentCreateChooser2 = Intent.createChooser(intent2, null);
            AbstractC16544l.m18091d(intentCreateChooser2);
            imageDetailViewModelImpl2.m14393h(new C2055d(intentCreateChooser2));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K2 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8731f(imageDetailViewModelImpl2.f38737t, "Failed to publish conversation", abstractC21933K2.f69485a, null, 4);
            imageDetailViewModelImpl2.m14393h(new C2059h(abstractC21933K2));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        imageDetailViewModelImpl2.m14397m(ImageDetailViewModelImpl$publishAndShareConversation$5.f38803Y);
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m14315q(ImageDetailViewModelImpl imageDetailViewModelImpl, Uri uri) {
        imageDetailViewModelImpl.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("image/*");
        Intent intentCreateChooser = Intent.createChooser(intent, imageDetailViewModelImpl.f38730m.m3160b(R.string.conversations_image_share_intent));
        AbstractC16544l.m18093f(intentCreateChooser, "createChooser(...)");
        imageDetailViewModelImpl.m14393h(new C2055d(intentCreateChooser));
    }

    @Override // androidx.lifecycle.ViewModel
    /* JADX INFO: renamed from: e */
    public final void mo11734e() {
        C2153Q0 c2153q0 = this.f38727j.f63106a;
        C19911P c19911p = new C19911P();
        c2153q0.getClass();
        c2153q0.m3251l(null, c19911p);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C18173j c18173j;
        InterfaceC19938w intent = (InterfaceC19938w) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        boolean z6 = intent instanceof C19935t;
        C17690x c17690x = C17690x.f56481Y;
        C3710a c3710a = this.f38732o;
        if (z6) {
            if (((C19935t) intent).f63193a == EnumC13617b.f43010o0) {
                C18173j c18173j2 = ((C19906K) m14391f()).f63092q;
                if (c18173j2 == null) {
                    return;
                } else {
                    c3710a.m4413a(C20886e.f66525m, c18173j2, c17690x);
                }
            }
            m14397m(new ImageDetailViewModelImpl$onIntent$1(intent));
            return;
        }
        boolean z10 = intent instanceof C19930o;
        C19921f c19921f = C19921f.f63179a;
        if (z10) {
            m14392g(c19921f);
            C19930o c19930o = (C19930o) intent;
            String str = ((C19906K) m14391f()).f63093r;
            AbstractC21955Q1 abstractC21955Q1 = c19930o.f63187a;
            if (!(abstractC21955Q1 instanceof C21952P1)) {
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
                    return;
                } else {
                    if (!(abstractC21955Q1 instanceof C21929J1)) {
                        throw new C0644w();
                    }
                    return;
                }
            }
            Uri uri = (Uri) ((C21952P1) abstractC21955Q1).f69511a;
            AbstractC21955Q1 abstractC21955Q2 = c19930o.f63188b;
            if (abstractC21955Q2 != null) {
                if (abstractC21955Q2 instanceof C21952P1) {
                    AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new ImageDetailViewModelImpl$emitDrawnImageToInputPanel$1$1$1(this, str, uri, (Uri) ((C21952P1) abstractC21955Q2).f69511a, null), 3);
                    return;
                } else if (abstractC21955Q2 instanceof AbstractC21933K1) {
                    m14393h(new C2059h((AbstractC21933K1) abstractC21955Q2));
                    return;
                } else {
                    if (!(abstractC21955Q2 instanceof C21929J1)) {
                        throw new C0644w();
                    }
                    return;
                }
            }
            return;
        }
        if (intent instanceof C19937v) {
            C18173j c18173j3 = ((C19906K) m14391f()).f63092q;
            if (c18173j3 == null) {
                return;
            }
            c3710a.m4413a(C20886e.f66526n, c18173j3, c17690x);
            m14392g(c19921f);
            m14394i(new ImageDetailViewModelImpl$emitImageToInputPanel$1(c18173j3, this, null));
            return;
        }
        if (intent instanceof C19933r) {
            m14397m(new ImageDetailViewModelImpl$onIntent$2(intent));
            return;
        }
        C19926k c19926k = C19926k.f63183a;
        if (intent.equals(c19926k)) {
            m14392g(c19921f);
            return;
        }
        if (intent.equals(C19928m.f63185a)) {
            m14397m(ImageDetailViewModelImpl$onIntent$3.f38770Y);
            return;
        }
        if (intent.equals(C19931p.f63189a)) {
            m14394i(new ImageDetailViewModelImpl$onIntent$4(this, null));
            return;
        }
        if (intent.equals(C19925j.f63182a)) {
            m14394i(new ImageDetailViewModelImpl$onIntent$5(this, null));
            return;
        }
        if (intent instanceof C19924i) {
            m14394i(new ImageDetailViewModelImpl$onIntent$6(this, intent, null));
            return;
        }
        if (intent.equals(c19926k)) {
            m14397m(ImageDetailViewModelImpl$onIntent$7.f38787Y);
            return;
        }
        if (intent instanceof C19929n) {
            m14394i(new ImageDetailViewModelImpl$onIntent$8(this, null));
            return;
        }
        if (intent instanceof C19927l) {
            m14397m(ImageDetailViewModelImpl$onIntent$9.f38795Y);
            this.f38731n.m14818a(EnumC1702g.DalleOperatioOnboarding);
            return;
        }
        if (intent instanceof C19932q) {
            Intent intent2 = new Intent();
            AbstractC9186P.m9748b(intent2, "https://help.openai.com/en/articles/9055440");
            m14393h(new C2055d(intent2));
        } else if (intent instanceof C19936u) {
            m14397m(new ImageDetailViewModelImpl$onIntent$10(intent));
        } else {
            if (!(intent instanceof C19934s) || (c18173j = ((C19906K) m14391f()).f63092q) == null) {
                return;
            }
            c3710a.m4413a(C20886e.f66522j, c18173j, AbstractC17660E.m19258c(new C17309l("liked", Boolean.valueOf(((C19934s) intent).f63192a))));
            m14393h(new C2060i(R.string.image_feedback_response));
        }
    }
}
