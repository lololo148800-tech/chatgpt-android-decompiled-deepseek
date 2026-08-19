package p917o6;

import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC7849B0;

/* JADX INFO: renamed from: o6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17849b implements InterfaceC17848a, InterfaceC17834B {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56902Y;

    public /* synthetic */ C17849b(int i10) {
        this.f56902Y = i10;
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object value) {
        switch (this.f56902Y) {
            case 0:
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                AbstractC16544l.m18094g(value, "value");
                AbstractC7849B0.m8108c(writer, value);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                writer.mo20548X(zBooleanValue);
                break;
            case 2:
                double dDoubleValue = ((Number) value).doubleValue();
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                writer.mo20542F(dDoubleValue);
                break;
            case 3:
                int iIntValue = ((Number) value).intValue();
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                writer.mo20540C(iIntValue);
                break;
            default:
                String value2 = (String) value;
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                AbstractC16544l.m18094g(value2, "value");
                writer.mo20544L(value2);
                break;
        }
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        switch (this.f56902Y) {
            case 0:
                AbstractC16544l.m18094g(reader, "reader");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                Object objM8091c = AbstractC7841A0.m8091c(reader);
                AbstractC16544l.m18091d(objM8091c);
                return objM8091c;
            case 1:
                AbstractC16544l.m18094g(reader, "reader");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                return Boolean.valueOf(reader.mo20566S0());
            case 2:
                AbstractC16544l.m18094g(reader, "reader");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                return Double.valueOf(reader.mo20563O());
            case 3:
                AbstractC16544l.m18094g(reader, "reader");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                return Integer.valueOf(reader.mo20573g0());
            default:
                AbstractC16544l.m18094g(reader, "reader");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                String strMo20582x = reader.mo20582x();
                AbstractC16544l.m18091d(strMo20582x);
                return strMo20582x;
        }
    }
}
