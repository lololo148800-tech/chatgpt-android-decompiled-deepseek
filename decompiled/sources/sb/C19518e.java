package sb;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p961qb.C18661b;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;
import p961qb.InterfaceC18665f;
import p961qb.InterfaceC18666g;

/* JADX INFO: renamed from: sb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19518e implements InterfaceC18664e, InterfaceC18666g {

    /* JADX INFO: renamed from: a */
    public final boolean f61986a = true;

    /* JADX INFO: renamed from: b */
    public final JsonWriter f61987b;

    /* JADX INFO: renamed from: c */
    public final HashMap f61988c;

    /* JADX INFO: renamed from: d */
    public final HashMap f61989d;

    /* JADX INFO: renamed from: e */
    public final C19514a f61990e;

    /* JADX INFO: renamed from: f */
    public final boolean f61991f;

    public C19518e(Writer writer, HashMap map, HashMap map2, C19514a c19514a, boolean z6) {
        this.f61987b = new JsonWriter(writer);
        this.f61988c = map;
        this.f61989d = map2;
        this.f61990e = c19514a;
        this.f61991f = z6;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: a */
    public final InterfaceC18664e mo8314a(C18662c c18662c, int i10) throws IOException {
        String str = c18662c.f59417a;
        m20620h();
        JsonWriter jsonWriter = this.f61987b;
        jsonWriter.name(str);
        m20620h();
        jsonWriter.value(i10);
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: b */
    public final InterfaceC18664e mo8315b(C18662c c18662c, long j10) throws IOException {
        String str = c18662c.f59417a;
        m20620h();
        JsonWriter jsonWriter = this.f61987b;
        jsonWriter.name(str);
        m20620h();
        jsonWriter.value(j10);
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: c */
    public final InterfaceC18664e mo8316c(C18662c c18662c, Object obj) throws IOException {
        m20619g(obj, c18662c.f59417a);
        return this;
    }

    @Override // p961qb.InterfaceC18666g
    /* JADX INFO: renamed from: d */
    public final InterfaceC18666g mo8335d(String str) throws IOException {
        m20620h();
        this.f61987b.value(str);
        return this;
    }

    @Override // p961qb.InterfaceC18666g
    /* JADX INFO: renamed from: e */
    public final InterfaceC18666g mo8336e(boolean z6) throws IOException {
        m20620h();
        this.f61987b.value(z6);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C19518e m20618f(Object obj) throws IOException {
        int i10 = 0;
        JsonWriter jsonWriter = this.f61987b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m20618f(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m20619g(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new C18661b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC18663d interfaceC18663d = (InterfaceC18663d) this.f61988c.get(obj.getClass());
            if (interfaceC18663d != null) {
                jsonWriter.beginObject();
                interfaceC18663d.mo3472a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC18665f interfaceC18665f = (InterfaceC18665f) this.f61989d.get(obj.getClass());
            if (interfaceC18665f != null) {
                interfaceC18665f.mo3472a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f61990e.mo3472a(obj, this);
                throw null;
            }
            String strName = ((Enum) obj).name();
            m20620h();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            m20620h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                jsonWriter.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                m20620h();
                jsonWriter.value(j10);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                m20618f(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                m20618f(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final C19518e m20619g(Object obj, String str) throws IOException {
        boolean z6 = this.f61991f;
        JsonWriter jsonWriter = this.f61987b;
        if (z6) {
            if (obj != null) {
                m20620h();
                jsonWriter.name(str);
                m20618f(obj);
            }
            return this;
        }
        m20620h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            m20618f(obj);
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m20620h() {
        if (!this.f61986a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
