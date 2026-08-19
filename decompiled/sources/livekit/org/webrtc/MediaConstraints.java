package livekit.org.webrtc;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.List;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: loaded from: classes2.dex */
public class MediaConstraints {
    public final List<KeyValuePair> mandatory = new ArrayList();
    public final List<KeyValuePair> optional = new ArrayList();

    public static class KeyValuePair {
        private final String key;
        private final String value;

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            KeyValuePair keyValuePair = (KeyValuePair) obj;
            return this.key.equals(keyValuePair.key) && this.value.equals(keyValuePair.value);
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + this.key.hashCode();
        }

        public String toString() {
            return AbstractC9306j0.m9890i(this.key, ": ", this.value);
        }
    }

    public List<KeyValuePair> getMandatory() {
        return this.mandatory;
    }

    public List<KeyValuePair> getOptional() {
        return this.optional;
    }

    public String toString() {
        return AbstractC10763a.m11055m("mandatory: ", stringifyKeyValuePairList(this.mandatory), ", optional: ", stringifyKeyValuePairList(this.optional));
    }

    private static String stringifyKeyValuePairList(List<KeyValuePair> list) {
        StringBuilder sb2 = new StringBuilder("[");
        for (KeyValuePair keyValuePair : list) {
            if (sb2.length() > 1) {
                sb2.append(", ");
            }
            sb2.append(keyValuePair.toString());
        }
        sb2.append(TfazcFv.Lbp);
        return sb2.toString();
    }
}
