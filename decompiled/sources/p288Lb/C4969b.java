package p288Lb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p214Ib.C3679v;
import p265Kb.AbstractC4611d;
import p265Kb.AbstractC4616i;
import p265Kb.InterfaceC4623p;
import p312Mb.AbstractC5316a;
import p379Pb.C6381b;
import p379Pb.C6382c;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Lb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4969b extends AbstractC3656B {

    /* JADX INFO: renamed from: d */
    public static final C4968a f16198d = new C4968a(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16199a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f16200b;

    /* JADX INFO: renamed from: c */
    public final Object f16201c;

    public C4969b(C3669l c3669l, AbstractC3656B abstractC3656B, Class cls) {
        this.f16200b = new C4987t(c3669l, abstractC3656B, cls);
        this.f16201c = cls;
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) throws IOException {
        Date dateM5873c;
        switch (this.f16199a) {
            case 0:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                c6381b.mo5621a();
                while (c6381b.hasNext()) {
                    arrayList.add(((AbstractC3656B) ((C4987t) this.f16200b).f16260c).mo4358a(c6381b));
                }
                c6381b.mo5614E();
                int size = arrayList.size();
                Class cls = (Class) this.f16201c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i10 = 0; i10 < size; i10++) {
                    Array.set(objNewInstance, i10, arrayList.get(i10));
                }
                return objNewInstance;
            case 1:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC4623p) this.f16201c).mo3263R();
                c6381b.mo5621a();
                while (c6381b.hasNext()) {
                    collection.add(((AbstractC3656B) ((C4987t) this.f16200b).f16260c).mo4358a(c6381b));
                }
                c6381b.mo5614E();
                return collection;
            case 2:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                String strMo5634x = c6381b.mo5634x();
                synchronized (((ArrayList) this.f16200b)) {
                    try {
                        Iterator it = ((ArrayList) this.f16200b).iterator();
                        while (it.hasNext()) {
                            try {
                                dateM5873c = ((DateFormat) it.next()).parse(strMo5634x);
                            } catch (ParseException unused) {
                            }
                        }
                        try {
                            dateM5873c = AbstractC5316a.m5873c(strMo5634x, new ParsePosition(0));
                        } catch (ParseException e10) {
                            StringBuilder sbM11058p = AbstractC10763a.m11058p("Failed parsing '", strMo5634x, "' as Date; at path ");
                            sbM11058p.append(c6381b.mo5633j0());
                            throw new C3679v(sbM11058p.toString(), e10);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return ((AbstractC4973f) this.f16201c).mo5612a(dateM5873c);
            default:
                Object objMo4358a = ((C4988u) this.f16200b).f16264o0.mo4358a(c6381b);
                if (objMo4358a != null) {
                    Class cls2 = (Class) this.f16201c;
                    if (!cls2.isInstance(objMo4358a)) {
                        throw new C3679v("Expected a " + cls2.getName() + " but was " + objMo4358a.getClass().getName() + "; at path " + c6381b.mo5633j0());
                    }
                }
                return objMo4358a;
        }
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        String str;
        switch (this.f16199a) {
            case 0:
                if (obj == null) {
                    c6382c.m7016W();
                    return;
                }
                c6382c.m7018e();
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    ((C4987t) this.f16200b).mo4359b(c6382c, Array.get(obj, i10));
                }
                c6382c.m7008E();
                return;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c6382c.m7016W();
                    return;
                }
                c6382c.m7018e();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((C4987t) this.f16200b).mo4359b(c6382c, it.next());
                }
                c6382c.m7008E();
                return;
            case 2:
                Date date = (Date) obj;
                if (date == null) {
                    c6382c.m7016W();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f16200b).get(0);
                synchronized (((ArrayList) this.f16200b)) {
                    str = dateFormat.format(date);
                    break;
                }
                c6382c.m7010J0(str);
                return;
            default:
                ((C4988u) this.f16200b).f16264o0.mo4359b(c6382c, obj);
                return;
        }
    }

    public String toString() {
        switch (this.f16199a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f16200b).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    public C4969b(C3669l c3669l, Type type, AbstractC3656B abstractC3656B, InterfaceC4623p interfaceC4623p) {
        this.f16200b = new C4987t(c3669l, abstractC3656B, type);
        this.f16201c = interfaceC4623p;
    }

    public C4969b(AbstractC4973f abstractC4973f, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f16200b = arrayList;
        Objects.requireNonNull(abstractC4973f);
        this.f16201c = abstractC4973f;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (AbstractC4616i.f15045a >= 9) {
            arrayList.add(AbstractC4611d.m5349h(i10, i11));
        }
    }

    public C4969b(AbstractC4973f abstractC4973f, String str) {
        ArrayList arrayList = new ArrayList();
        this.f16200b = arrayList;
        Objects.requireNonNull(abstractC4973f);
        this.f16201c = abstractC4973f;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public C4969b(C4988u c4988u, Class cls) {
        this.f16200b = c4988u;
        this.f16201c = cls;
    }
}
