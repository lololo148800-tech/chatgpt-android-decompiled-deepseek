package p544W9;

import io.ktor.utils.p815io.InterfaceC15088n;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p024Am.C0560a;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3757e;
import p225Im.InterfaceC3777y;
import p225Im.InterfaceC3778z;
import p298Lm.C5213y0;
import p434Rk.C6911c;
import p488Tn.InterfaceC7526i;
import p523V9.AbstractC8120j6;
import p571X9.AbstractC9233X;
import p754fl.InterfaceC13692b;
import p792hl.AbstractC14527b;
import p792hl.C14529d;
import p792hl.C14530e;
import p857kl.C16460h;
import p909nm.AbstractC17680n;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.U2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8565U2 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m9226a(AbstractC14527b abstractC14527b, AbstractC19687c abstractC19687c) {
        C14529d c14529d;
        InterfaceC3777y interfaceC3777yM18075c;
        if (abstractC19687c instanceof C14529d) {
            c14529d = (C14529d) abstractC19687c;
            int i10 = c14529d.f45792Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14529d.f45792Z = i10 - Integer.MIN_VALUE;
            } else {
                c14529d = new C14529d(abstractC19687c);
            }
        } else {
            c14529d = new C14529d(abstractC19687c);
        }
        Object objM7294a = c14529d.f45791Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14529d.f45792Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7294a);
            C6911c c6911cMo7303b = abstractC14527b.mo7303b();
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(InterfaceC15088n.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(InterfaceC15088n.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c14529d.f45792Z = 1;
            objM7294a = c6911cMo7303b.m7294a(c21296a, c14529d);
            if (objM7294a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM7294a);
        }
        if (objM7294a != null) {
            return (InterfaceC15088n) objM7294a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m9227b(AbstractC14527b abstractC14527b, Charset charset, AbstractC19687c abstractC19687c) {
        C14530e c14530e;
        CharsetDecoder charsetDecoder;
        if (abstractC19687c instanceof C14530e) {
            c14530e = (C14530e) abstractC19687c;
            int i10 = c14530e.f45795o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14530e.f45795o0 = i10 - Integer.MIN_VALUE;
            } else {
                c14530e = new C14530e(abstractC19687c);
            }
        } else {
            c14530e = new C14530e(abstractC19687c);
        }
        Object objM7294a = c14530e.f45794Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14530e.f45795o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7294a);
            AbstractC16544l.m18094g(abstractC14527b, "<this>");
            C16460h c16460hM9325c = AbstractC8651i4.m9325c(abstractC14527b);
            InterfaceC3777y interfaceC3777yM18075c = null;
            Charset charsetM9277a = c16460hM9325c != null ? AbstractC8627e4.m9277a(c16460hM9325c) : null;
            if (charsetM9277a != null) {
                charset = charsetM9277a;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            C6911c c6911cMo7303b = abstractC14527b.mo7303b();
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(InterfaceC7526i.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(InterfaceC7526i.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c14530e.f45793Y = charsetDecoderNewDecoder;
            c14530e.f45795o0 = 1;
            objM7294a = c6911cMo7303b.m7294a(c21296a, c14530e);
            if (objM7294a == enumC19250a) {
                return enumC19250a;
            }
            charsetDecoder = charsetDecoderNewDecoder;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            charsetDecoder = c14530e.f45793Y;
            AbstractC9233X.m9807c(objM7294a);
        }
        if (objM7294a == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.io.Source");
        }
        AbstractC16544l.m18091d(charsetDecoder);
        return AbstractC8120j6.m8624b(charsetDecoder, (InterfaceC7526i) objM7294a, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC3756d m9228c(InterfaceC3757e interfaceC3757e) {
        Object obj;
        if (interfaceC3757e instanceof InterfaceC3756d) {
            return (InterfaceC3756d) interfaceC3757e;
        }
        if (!(interfaceC3757e instanceof InterfaceC3778z)) {
            throw new C0560a("Cannot calculate JVM erasure for type: " + interfaceC3757e);
        }
        List upperBounds = ((InterfaceC3778z) interfaceC3757e).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC3777y interfaceC3777y = (InterfaceC3777y) next;
            AbstractC16544l.m18092e(interfaceC3777y, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((C5213y0) interfaceC3777y).f16935Y.getConstructor().mo22589getDeclarationDescriptor();
            ClassDescriptor classDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
            if (classDescriptor != null && classDescriptor.getKind() != ClassKind.INTERFACE && classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        InterfaceC3777y interfaceC3777y2 = (InterfaceC3777y) obj;
        if (interfaceC3777y2 == null) {
            interfaceC3777y2 = (InterfaceC3777y) AbstractC17680n.m19343S(upperBounds);
        }
        return interfaceC3777y2 != null ? m9229d(interfaceC3777y2) : AbstractC16526C.f51263a.mo5693b(Object.class);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC3756d m9229d(InterfaceC3777y interfaceC3777y) {
        InterfaceC3757e classifier = interfaceC3777y.getClassifier();
        if (classifier != null) {
            return m9228c(classifier);
        }
        throw new C0560a("Cannot calculate JVM erasure for type: " + interfaceC3777y);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC13692b m9230e(AbstractC14527b abstractC14527b) {
        AbstractC16544l.m18094g(abstractC14527b, "<this>");
        return abstractC14527b.mo7303b().m7296c();
    }
}
