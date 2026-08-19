package p046Bk;

import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1009s9.C19506i;
import p960q9.C18655i;

/* JADX INFO: renamed from: Bk.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C1420z {

    /* JADX INFO: renamed from: a */
    public final C18655i f3800a;

    /* JADX INFO: renamed from: b */
    public final C19506i f3801b;

    public C1420z(C18655i c18655i, C19506i c19506i) {
        this.f3800a = c18655i;
        this.f3801b = c19506i;
    }

    /* JADX INFO: renamed from: a */
    public static List m2048a(boolean z6, List list, String str, String str2) {
        Object next;
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC16544l.m18089b(((UiComponentError) next).getName(), str));
        UiComponentError uiComponentError = (UiComponentError) next;
        if (!z6) {
            if (uiComponentError instanceof UiComponentError.UiGovernmentIdNfcScanComponentError) {
                UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentError;
                Map<String, String> message = uiGovernmentIdNfcScanComponentError.getMessage();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : message.entrySet()) {
                    if (!AbstractC16544l.m18089b(entry.getKey(), str2)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                uiGovernmentIdNfcScanComponentError.setMessage(linkedHashMap);
            } else {
                if (!(uiComponentError instanceof UiComponentError.UiInputAddressComponentError)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (!AbstractC16544l.m18089b(((UiComponentError) obj).getName(), str)) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                }
                UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = (UiComponentError.UiInputAddressComponentError) uiComponentError;
                Map<String, String> message2 = uiInputAddressComponentError.getMessage();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry2 : message2.entrySet()) {
                    if (!AbstractC16544l.m18089b(entry2.getKey(), str2)) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                uiInputAddressComponentError.setMessage(linkedHashMap2);
            }
        }
        return list;
    }
}
