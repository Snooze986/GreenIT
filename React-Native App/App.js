import React from 'react';
import { StyleSheet, Text, View, FlatList, Image } from 'react-native';

export default class App extends React.Component {
  constructor(props){
    super(props)

    const content = [{id: 0, img: "http://fr.web.img3.acsta.net/c_215_290/pictures/17/07/10/17/13/380931.jpg", title: "EPOUSE-MOI MON POTE"},
    {id: 1, img: "http://fr.web.img5.acsta.net/c_215_290/pictures/17/06/23/09/20/377670.jpg", title: "ÔTEZ-MOI D'UN DOUTE"},
    {id: 2, img: "http://fr.web.img2.acsta.net/c_215_290/pictures/17/05/31/11/13/023056.jpg", title: "CONFIDENT ROYAL"},
    {id: 3, img: "http://fr.web.img3.acsta.net/c_215_290/pictures/17/07/26/10/49/580251.jpg", title: "CAPITAINE SUPERSLIP"},
    {id: 4, img: "http://fr.web.img2.acsta.net/c_215_290/pictures/17/03/29/14/40/513263.jpg", title: "ÇA"},
    {id: 5, img: "http://fr.web.img4.acsta.net/c_215_290/pictures/17/06/02/10/02/162904.jpg", title: "SEVEN SISTERS"},
    {id: 6, img: "http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/12/11/50/570288.jpg", title: "LE SENS DE LA FÊTE"},
    {id: 7, img: "http://fr.web.img5.acsta.net/c_215_290/pictures/17/07/12/10/33/047891.jpg", title: "LE PETIT SPIROU"},
    {id: 8, img: "http://fr.web.img5.acsta.net/c_215_290/pictures/17/08/24/15/18/597734.jpg", title: "BLADE RUNNER 2049"},
    {id: 9, img: "http://fr.web.img4.acsta.net/c_215_290/pictures/17/07/05/12/44/185176.jpg", title: "BARBARA"},
    {id: 10, img: "http://fr.web.img3.acsta.net/c_215_290/pictures/17/06/12/09/36/489167.jpg", title: "MON GARÇON"},
    {id: 11, img: "http://fr.web.img3.acsta.net/c_215_290/pictures/17/06/07/15/34/557760.jpg", title: "BARRY SEAL : AMERICAN TRAFFIC"},
    {id: 12, img: "http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/13/10/58/207157.jpg", title: "PETIT PAYSAN"},
    {id: 13, img: "http://fr.web.img4.acsta.net/c_215_290/pictures/17/07/20/17/39/592819.jpg", title: "L'UN DANS L'AUTRE"},
    {id: 14, img: "http://fr.web.img2.acsta.net/c_215_290/pictures/17/07/28/10/01/148014.jpg", title: "GAUGUIN - VOYAGE DE TAHITI"},
    {id: 15, img: "http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/17/12/49/199993.jpg", title: "LES GRANDS ESPRITS"},
    {id: 16, img: "http://fr.web.img2.acsta.net/c_215_290/pictures/17/06/20/17/08/123241.jpg", title: "BIGFOOT JUNIOR"},
    {id: 17, img: "http://fr.web.img5.acsta.net/c_215_290/pictures/17/09/08/09/41/2636970.jpg", title: "MOTHER!"},
    {id: 18, img: "http://fr.web.img3.acsta.net/c_215_290/pictures/17/07/28/15/56/266725.jpg", title: "UN BEAU SOLEIL INTÉRIEUR"},
    {id: 19, img: "http://fr.web.img2.acsta.net/c_215_290/pictures/17/08/02/16/51/407072.jpg", title: "AMERICAN ASSASSIN"},
    {id: 20, img: "http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/28/10/00/052385.jpg", title: "LE REDOUTABLE"}]

    this.state = {content}
  }

  renderItem = ({item}) => {
    return (
      <View style={styles.view}>
        <Image style={styles.img} source={{uri: item.img}} />
        <Text style={styles.title}>{item.title}</Text>
      </View>
    )
  }

  render() {
    return (
      <View style={styles.container}>
        <FlatList
        data={this.state.content}
        extraData={this.state}
        renderItem={this.renderItem}
        keyExtractor={(item, index) => item.id}
        showsVerticalScrollIndicator={false}
        style={styles.flatlist}
        />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    marginTop: 24,
  },
  img: {
    width: 150,
    height: 100,
    resizeMode: "contain"
  },
  view: {
    flexDirection: 'row',
    alignItems: 'center',
    borderWidth: 0.5,
    borderColor: '#d6d7da',
  },
  title: {
    flex: 1,
    marginHorizontal: 8
  }
});
