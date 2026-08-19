package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p025An.C0644w;
import p1113xn.AbstractC21329w;
import p606Yn.C10107h;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17656A;
import p909nm.C17692z;

/* JADX INFO: loaded from: classes2.dex */
public class JvmNameResolverBase implements NameResolver {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final List f52664d;

    /* JADX INFO: renamed from: a */
    public final String[] f52665a;

    /* JADX INFO: renamed from: b */
    public final Set f52666b;

    /* JADX INFO: renamed from: c */
    public final List f52667c;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strM19349Y = AbstractC17680n.m19349Y(AbstractC17681o.m19382k('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62);
        List listM19382k = AbstractC17681o.m19382k(AbstractC10763a.m11052j(strM19349Y, "/Any"), AbstractC10763a.m11052j(strM19349Y, "/Nothing"), AbstractC10763a.m11052j(strM19349Y, "/Unit"), AbstractC10763a.m11052j(strM19349Y, "/Throwable"), AbstractC10763a.m11052j(strM19349Y, "/Number"), AbstractC10763a.m11052j(strM19349Y, "/Byte"), AbstractC10763a.m11052j(strM19349Y, "/Double"), AbstractC10763a.m11052j(strM19349Y, "/Float"), AbstractC10763a.m11052j(strM19349Y, "/Int"), AbstractC10763a.m11052j(strM19349Y, "/Long"), AbstractC10763a.m11052j(strM19349Y, "/Short"), AbstractC10763a.m11052j(strM19349Y, "/Boolean"), AbstractC10763a.m11052j(strM19349Y, "/Char"), AbstractC10763a.m11052j(strM19349Y, "/CharSequence"), AbstractC10763a.m11052j(strM19349Y, "/String"), AbstractC10763a.m11052j(strM19349Y, "/Comparable"), AbstractC10763a.m11052j(strM19349Y, "/Enum"), AbstractC10763a.m11052j(strM19349Y, "/Array"), AbstractC10763a.m11052j(strM19349Y, "/ByteArray"), AbstractC10763a.m11052j(strM19349Y, "/DoubleArray"), AbstractC10763a.m11052j(strM19349Y, "/FloatArray"), AbstractC10763a.m11052j(strM19349Y, "/IntArray"), AbstractC10763a.m11052j(strM19349Y, "/LongArray"), AbstractC10763a.m11052j(strM19349Y, "/ShortArray"), AbstractC10763a.m11052j(strM19349Y, "/BooleanArray"), AbstractC10763a.m11052j(strM19349Y, "/CharArray"), AbstractC10763a.m11052j(strM19349Y, "/Cloneable"), AbstractC10763a.m11052j(strM19349Y, "/Annotation"), AbstractC10763a.m11052j(strM19349Y, "/collections/Iterable"), AbstractC10763a.m11052j(strM19349Y, "/collections/MutableIterable"), AbstractC10763a.m11052j(strM19349Y, "/collections/Collection"), AbstractC10763a.m11052j(strM19349Y, "/collections/MutableCollection"), AbstractC10763a.m11052j(strM19349Y, "/collections/List"), AbstractC10763a.m11052j(strM19349Y, "/collections/MutableList"), AbstractC10763a.m11052j(strM19349Y, "/collections/Set"), AbstractC10763a.m11052j(strM19349Y, "/collections/MutableSet"), AbstractC10763a.m11052j(strM19349Y, "/collections/Map"), AbstractC10763a.m11052j(strM19349Y, "/collections/MutableMap"), AbstractC10763a.m11052j(strM19349Y, "/collections/Map.Entry"), AbstractC10763a.m11052j(strM19349Y, "/collections/MutableMap.MutableEntry"), AbstractC10763a.m11052j(strM19349Y, "/collections/Iterator"), AbstractC10763a.m11052j(strM19349Y, "/collections/MutableIterator"), AbstractC10763a.m11052j(strM19349Y, "/collections/ListIterator"), AbstractC10763a.m11052j(strM19349Y, "/collections/MutableListIterator"));
        f52664d = listM19382k;
        C10107h c10107hM19332I0 = AbstractC17680n.m19332I0(listM19382k);
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(c10107hM19332I0, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        Iterator it = c10107hM19332I0.iterator();
        while (true) {
            C17656A c17656a = (C17656A) it;
            if (!c17656a.f56445Z.hasNext()) {
                return;
            }
            C17692z c17692z = (C17692z) c17656a.next();
            linkedHashMap.put((String) c17692z.f56484b, Integer.valueOf(c17692z.f56483a));
        }
    }

    public JvmNameResolverBase(String[] strings, Set<Integer> localNameIndices, List<JvmProtoBuf.StringTableTypes.Record> records) {
        AbstractC16544l.m18094g(strings, "strings");
        AbstractC16544l.m18094g(localNameIndices, "localNameIndices");
        AbstractC16544l.m18094g(records, "records");
        this.f52665a = strings;
        this.f52666b = localNameIndices;
        this.f52667c = records;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getQualifiedClassName(int i10) {
        return getString(i10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i10) {
        String strM21730q;
        JvmProtoBuf.StringTableTypes.Record record = (JvmProtoBuf.StringTableTypes.Record) this.f52667c.get(i10);
        if (record.hasString()) {
            strM21730q = record.getString();
        } else if (record.hasPredefinedIndex()) {
            List list = f52664d;
            int size = list.size();
            int predefinedIndex = record.getPredefinedIndex();
            if (predefinedIndex < 0 || predefinedIndex >= size) {
                strM21730q = this.f52665a[i10];
            } else {
                strM21730q = (String) list.get(record.getPredefinedIndex());
            }
        } else {
            strM21730q = this.f52665a[i10];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            AbstractC16544l.m18091d(substringIndexList);
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strM21730q.length()) {
                strM21730q = strM21730q.substring(num.intValue(), num2.intValue());
                AbstractC16544l.m18093f(strM21730q, "substring(...)");
            }
        }
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            AbstractC16544l.m18091d(replaceCharList);
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            AbstractC16544l.m18091d(strM21730q);
            strM21730q = AbstractC21329w.m21730q(strM21730q, (char) num3.intValue(), (char) num4.intValue());
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                AbstractC16544l.m18091d(strM21730q);
                strM21730q = AbstractC21329w.m21730q(strM21730q, '$', '.');
            } else {
                if (i11 != 3) {
                    throw new C0644w();
                }
                if (strM21730q.length() >= 2) {
                    strM21730q = strM21730q.substring(1, strM21730q.length() - 1);
                    AbstractC16544l.m18093f(strM21730q, "substring(...)");
                }
                strM21730q = AbstractC21329w.m21730q(strM21730q, '$', '.');
            }
        }
        AbstractC16544l.m18091d(strM21730q);
        return strM21730q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i10) {
        return this.f52666b.contains(Integer.valueOf(i10));
    }
}
