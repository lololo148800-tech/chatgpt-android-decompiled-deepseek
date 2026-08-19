package p185H6;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p025An.C0644w;
import p026Ao.C0675i;
import p060C6.C1606c;
import p1111xl.C21296a;
import p225Im.AbstractC3751J;
import p225Im.InterfaceC3777y;
import p409Qk.C6752c;
import p434Rk.C6911c;
import p523V9.AbstractC8142m4;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.AbstractC14527b;
import p792hl.C14535j;
import p857kl.AbstractC16435B;
import p857kl.C16438E;
import p857kl.C16477y;
import p909nm.AbstractC17682p;
import p942p6.C18299c;
import p942p6.C18301e;
import p942p6.EnumC18300d;
import p942p6.InterfaceC18298b;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: H6.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3260p implements InterfaceC3247c {

    /* JADX INFO: renamed from: Y */
    public final C6752c f9926Y;

    /* JADX INFO: renamed from: Z */
    public boolean f9927Z;

    public C3260p(C6752c c6752c) {
        this.f9926Y = c6752c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9927Z) {
            return;
        }
        this.f9926Y.close();
        this.f9927Z = true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0106 A[Catch: all -> 0x0031, CancellationException -> 0x0034, TryCatch #2 {CancellationException -> 0x0034, all -> 0x0031, blocks: (B:13:0x002c, B:50:0x0106, B:51:0x0132, B:53:0x0138, B:54:0x014f, B:56:0x0158, B:57:0x015f, B:21:0x003f, B:46:0x00e0, B:24:0x0047, B:27:0x0063, B:31:0x006e, B:32:0x0079, B:34:0x007f, B:36:0x0090, B:37:0x0098, B:39:0x009e, B:41:0x00a8, B:42:0x00af, B:43:0x00d2, B:28:0x0066, B:29:0x006b, B:30:0x006c), top: B:61:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0138 A[Catch: all -> 0x0031, CancellationException -> 0x0034, LOOP:0: B:51:0x0132->B:53:0x0138, LOOP_END, TryCatch #2 {CancellationException -> 0x0034, all -> 0x0031, blocks: (B:13:0x002c, B:50:0x0106, B:51:0x0132, B:53:0x0138, B:54:0x014f, B:56:0x0158, B:57:0x015f, B:21:0x003f, B:46:0x00e0, B:24:0x0047, B:27:0x0063, B:31:0x006e, B:32:0x0079, B:34:0x007f, B:36:0x0090, B:37:0x0098, B:39:0x009e, B:41:0x00a8, B:42:0x00af, B:43:0x00d2, B:28:0x0066, B:29:0x006b, B:30:0x006c), top: B:61:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0158 A[Catch: all -> 0x0031, CancellationException -> 0x0034, TryCatch #2 {CancellationException -> 0x0034, all -> 0x0031, blocks: (B:13:0x002c, B:50:0x0106, B:51:0x0132, B:53:0x0138, B:54:0x014f, B:56:0x0158, B:57:0x015f, B:21:0x003f, B:46:0x00e0, B:24:0x0047, B:27:0x0063, B:31:0x006e, B:32:0x0079, B:34:0x007f, B:36:0x0090, B:37:0x0098, B:39:0x009e, B:41:0x00a8, B:42:0x00af, B:43:0x00d2, B:28:0x0066, B:29:0x006b, B:30:0x006c), top: B:61:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p185H6.InterfaceC3247c
    /* JADX INFO: renamed from: w */
    public final Object mo4137w(C11238i c11238i, AbstractC19687c abstractC19687c) {
        C3259o c3259o;
        C16438E c16438e;
        AbstractC14527b abstractC14527b;
        ArrayList arrayList;
        if (abstractC19687c instanceof C3259o) {
            c3259o = (C3259o) abstractC19687c;
            int i10 = c3259o.f9925p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3259o.f9925p0 = i10 - Integer.MIN_VALUE;
            } else {
                c3259o = new C3259o(this, abstractC19687c);
            }
        } else {
            c3259o = new C3259o(this, abstractC19687c);
        }
        Object objM16038c = c3259o.f9923Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3259o.f9925p0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC9233X.m9807c(objM16038c);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC14527b = c3259o.f9922Y;
                    AbstractC9233X.m9807c(objM16038c);
                }
                if (objM16038c != null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                }
                C0675i c0675i = new C0675i();
                c0675i.m1433d1((byte[]) objM16038c);
                int i12 = abstractC14527b.mo7307f().f51013Y;
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C17309l> arrayListM8674b = AbstractC8142m4.m8674b(abstractC14527b.mo7301a());
                arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM8674b, 10));
                for (C17309l c17309l : arrayListM8674b) {
                    arrayList.add(new C18299c((String) c17309l.f55136Y, (String) c17309l.f55137Z));
                }
                arrayList2.addAll(arrayList);
                return new C18301e(i12, arrayList2, c0675i);
            }
            AbstractC9233X.m9807c(objM16038c);
            C6752c c6752c = this.f9926Y;
            String str = (String) c11238i.f34009Z;
            C13693c c13693c = new C13693c();
            C16477y c16477y = c13693c.f43197c;
            AbstractC13695e.m15172b(c13693c, str);
            int iOrdinal = ((EnumC18300d) c11238i.f34008Y).ordinal();
            if (iOrdinal == 0) {
                c16438e = C16438E.f50984b;
            } else {
                if (iOrdinal != 1) {
                    throw new C0644w();
                }
                c16438e = C16438E.f50985c;
            }
            c13693c.m15168c(c16438e);
            for (C18299c c18299c : (ArrayList) c11238i.f34010o0) {
                String key = c18299c.f58411a;
                String str2 = c18299c.f58412b;
                AbstractC16544l.m18094g(key, "key");
                if (str2 != null) {
                    c16477y.m4529e(key, str2.toString());
                }
            }
            InterfaceC18298b interfaceC18298b = (InterfaceC18298b) c11238i.f34011p0;
            if (interfaceC18298b != null) {
                List list = AbstractC16435B.f50983a;
                String contentType = interfaceC18298b.getContentType();
                if (contentType != null) {
                    c16477y.m4529e(SIPHeaderNames.CONTENT_TYPE, contentType.toString());
                }
                C0675i c0675i2 = new C0675i();
                interfaceC18298b.mo3050g(c0675i2);
                c13693c.f43198d = c0675i2.m1428Z0();
                InterfaceC3777y interfaceC3777yM18075c = AbstractC16526C.m18075c(String.class);
                AbstractC3751J.m4443h(interfaceC3777yM18075c);
                c13693c.m15167b(new C21296a(AbstractC16526C.f51263a.mo5693b(String.class), interfaceC3777yM18075c));
            }
            C14535j c14535j = new C14535j(c13693c, c6752c);
            c3259o.f9925p0 = 1;
            objM16038c = c14535j.m16038c(c3259o);
            if (objM16038c == enumC19250a) {
                return enumC19250a;
            }
            abstractC14527b = (AbstractC14527b) objM16038c;
            C6911c c6911cMo7303b = abstractC14527b.mo7303b();
            InterfaceC3777y interfaceC3777yM18075c2 = AbstractC16526C.m18075c(byte[].class);
            AbstractC3751J.m4443h(interfaceC3777yM18075c2);
            C21296a c21296a = new C21296a(AbstractC16526C.f51263a.mo5693b(byte[].class), interfaceC3777yM18075c2);
            c3259o.f9922Y = abstractC14527b;
            c3259o.f9925p0 = 2;
            objM16038c = c6911cMo7303b.m7294a(c21296a, c3259o);
            if (objM16038c == enumC19250a) {
                return enumC19250a;
            }
            if (objM16038c != null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
            }
            C0675i c0675i3 = new C0675i();
            c0675i3.m1433d1((byte[]) objM16038c);
            int i13 = abstractC14527b.mo7307f().f51013Y;
            ArrayList arrayList3 = new ArrayList();
            ArrayList<C17309l> arrayListM8674b2 = AbstractC8142m4.m8674b(abstractC14527b.mo7301a());
            arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM8674b2, 10));
            while (r13.hasNext()) {
                arrayList.add(new C18299c((String) c17309l.f55136Y, (String) c17309l.f55137Z));
            }
            arrayList3.addAll(arrayList);
            return new C18301e(i13, arrayList3, c0675i3);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            throw new C1606c(th2.getMessage(), th2);
        }
    }
}
